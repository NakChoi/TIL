public class Main {
    static long startTime = 0;
    public static void main(String[] args) {


        /*for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println("소요시간  :" + (System.currentTimeMillis()- startTime));

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.println("소요시간 2 :" + (System.currentTimeMillis()- startTime));*/

        ThreadEx4 t1 = new ThreadEx4();
        t1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }

        System.out.println("소요시간 1 : "+ (System.currentTimeMillis() - Main.startTime));


    }
}

class ThreadEx4 extends Thread{
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.println("소요시간 2 : "+ (System.currentTimeMillis() - Main.startTime));
    }


}