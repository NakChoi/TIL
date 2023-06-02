package com.example.chatprogram;

import com.example.chatprogram.client.Client;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatApplication extends Application {

    public static ExecutorService threadPool; // 쓰레드 풀을 이용해 다양한 클라이언트가 접속했을 때 쓰레드들을 효과적으로 이용하기 위함.
                                                // 쓰레드 풀을 사용하면 쓰레드 수의 제한을 걸기 때문에 갑작스럽게 클라이언트의 수가 증가하더라도 서버의 성능 저하를 방지할 수 있다.
    public static Vector<Client> clients = new Vector<Client>(); // 접속한 클라이언트들을 관리할 수 있게 함. 일종의 배열

    ServerSocket serverSocket;

    // 서버를 구동시켜서 클라이언트의 연결을 기다리는 메소드이다.
    // 어떠한 ip로 어떠한 port를 열어서 클라이언트와 통신을 할건지.
    public void startServer(String IP, int port){
        try  {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(IP, port)); // 소켓에 대한 객체를 활성화 시키고 바인드를 해서 서버 역할을 하는 컴퓨터가
                                                                // 자신의 ip 주소 그리고 port 번호로 특정한 client 접속을 기다리게 만들 수 있다.
        } catch (Exception e){
            e.printStackTrace();
            if (!serverSocket.isClosed()) {
                stopServer();
            }
            return;
        }

        // 클라이언트가 접속할 때까지 계속 기다리는 쓰레드이다.
        Runnable thread = new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        Socket socket = serverSocket.accept();
                        clients.add(new Client(socket));
                        System.out.println("[클라이언트 접속] "
                        + socket.getRemoteSocketAddress()
                        + ": " + Thread.currentThread().getName());
                    }catch (Exception e){
                        if (!serverSocket.isClosed()) {
                            stopServer();;
                        }
                        break;
                    }
                }
            }
        };
        threadPool = Executors.newCachedThreadPool(); // 쓰레드 풀 초기화
        threadPool.submit(thread); // 쓰레드 풀의
    }

    // 서버의 작동을 중지시키는 메소드이다.
    public void stopServer() {
        try {
            // 현재 작동 중인 모든 소켓 닫기
            Iterator<Client> iterator = clients.iterator();
            while (iterator.hasNext()) {
                Client client = iterator.next();
                client.socket.close();
                iterator.remove();
            }
            // 서버 소켓 객체
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }

            // 쓰레드 풀 종료하기
            if (threadPool != null && !threadPool.isShutdown()) {
                threadPool.shutdown();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UI를 생성하고, 실질적으로 프로그램을 동작시키는 메소드이다.
    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane root = new BorderPane(); // 전체적인 틀
        root.setPadding(new Insets(5));

        TextArea textArea = new TextArea();
        textArea.setEditable(false); // 수정 불가능
        textArea.setFont(new Font("나눔고딕", 15));

        root.setCenter(textArea);

        Button toggleButton = new Button("시작하기");
        toggleButton.setMaxWidth(Double.MAX_VALUE);
        BorderPane.setMargin(toggleButton, new Insets(1, 0, 0, 0));
        root.setBottom(toggleButton);

        String IP = "127.0.0.1"; // 로컬 주소
        int port = 9876;

        toggleButton.setOnAction(event -> {
            if (toggleButton.getText().equals("시작하기")) {
                startServer(IP, port);
                Platform.runLater(() ->{
                    String message = String.format("[서버 시작] \n", IP, port);
                    textArea.appendText(message);
                    toggleButton.setText("종료하기");
                });
            }else {
                stopServer();
                Platform.runLater(() ->{
                    String message = String.format("[서버 종료] \n", IP, port);
                    textArea.appendText(message);
                    toggleButton.setText("시작하기");
                });
            }
        });

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle(" [채팅 서버] ");
        primaryStage.setOnCloseRequest(event -> stopServer());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 프로그램의 진입점이다.
    public static void main(String[] args) {
        launch();
    }
}



