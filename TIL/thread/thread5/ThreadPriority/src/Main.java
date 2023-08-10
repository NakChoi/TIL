public class Main {
    public static void main(String[] args) {

        ThreadEx5_1 t1 = new ThreadEx5_1();
        ThreadEx5_2 t2 = new ThreadEx5_2();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);


        System.out.println("Priority of th1(-) : " + t1.getPriority());
        System.out.println("Priority of th1(|) : " + t2.getPriority());

        t1.start();
        t2.start();

    }
}


class ThreadEx5_1 extends Thread{
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int x = 0; x < 10000000; x++) { // 작업을 지연 시키기 위한 for문

            }
        }
    }
}

class ThreadEx5_2 extends Thread{
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int x = 0; x < 10000000; x++) { // 작업을 지연 시키기 위한 for문

            }
        }
    }
}