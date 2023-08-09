public class Main {
    public static void main(String[] args) {
       /* ThreadEx2_1 t1 = new ThreadEx2_1();

        t1.start();*/

        ThreadEx3_1 t2 = new ThreadEx3_1();

        t2.run();

    }
}


class ThreadEx2_1 extends Thread {
    public void run(){
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ThreadEx3_1 extends Thread{
    public void run() {
        throwExeption();
    }

    public void throwExeption() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}