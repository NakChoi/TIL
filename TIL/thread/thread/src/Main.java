public class Main {
    public static void main(String[] args) {

        // 상속을 통한 Thread 구현
        threadExtend t1 = new threadExtend();

        // 인터페이스를 통한 thread 구현
        Runnable r = new threadImplement();
        Thread t2 = new Thread(r, "이름을 바꾸고 싶엉");

        t1.start();
        t2.start();
    }
}