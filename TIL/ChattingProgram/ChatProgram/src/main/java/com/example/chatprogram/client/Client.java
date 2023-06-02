package com.example.chatprogram.client;

import com.example.chatprogram.ChatApplication;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client { // 챗 서버가 한명의 클라이언트와 통신을 하기 위해서 필요한 기능을 정의하기 위한 클래스

    public Socket socket;

    public Client(Socket socket) {
        this.socket = socket;
        receive();
    }

    // 클라이언트로부터 메시지를 전달 받는 메소드이다.
    public void receive() {
        Runnable thread = new Runnable() {
            @Override
            public void run() { // 하나의 쓰레드가 어떠한 모듈로서 동작을 할건지 run 안에서 정의를 해줘야한다.
                try {
                    while (true) {
                        InputStream in = socket.getInputStream();
                        byte[] buffer = new byte[512];
                        int length = in.read(buffer);
                        while(length ==-1) throw new IOException();
                        System.out.println("[메시지 수신 성공]"
                                +socket.getRemoteSocketAddress()
                                + ": " + Thread.currentThread().getName());

                        String message = new String(buffer, 0, length, "UTF-8");

                        for (Client client : ChatApplication.clients) {
                            client.send(message);
                            System.out.println(message);
                        }

                    }
                } catch (Exception e) {
                    try {
                        System.out.println("[메시지 수신 오류] "
                        + socket.getRemoteSocketAddress()
                        + ": " + Thread.currentThread().getName());
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        };
        ChatApplication.threadPool.submit(thread); // 쓰레드 풀에 쓰레드 등록
    }

    // 클라이언트에게 메시지를 전송하는 메소드이다./
    public void send(String message) {
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                try {
                    OutputStream out = socket.getOutputStream();
                    byte[] buffer = message.getBytes("UTF-8");
                    out.write(buffer);
                    out.flush(); // 성공적으로 전송했다는 것을 알리기 위함.


                } catch (IOException e) {
                    try {
                        System.out.println("메시지 송신 오류"
                        + socket.getRemoteSocketAddress()
                        + ": " + Thread.currentThread().getName());
                        ChatApplication.clients.remove(Client.this); // 오류로 해당 클라이언트와의 연결이 끊어 졌으므로 서버안에서도 해당 클라이언트를 삭제시켜야한다.
                        socket.close(); // 소켓 닫음
                    } catch (Exception e2) {
                    }
                }


            }
        };

        ChatApplication.threadPool.submit(thread);

    }
}
