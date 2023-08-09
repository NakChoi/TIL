public class Main implements Runnable{
    static boolean autoSave = false;
    public static void main(String[] args) {
        Thread t = new Thread(new Main());

        t.setDaemon(true);
        t.start();

        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

            System.out.println(i);

            if (i == 7) {
                autoSave = true;
            }
        }

        System.out.println("프로그램을 종료합니다.");



    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {}

            if (autoSave) {
                authSave();
            }
        }
    }

    public void authSave() {
        System.out.println("작업 파일이 자동저장되었습니다.");
    }
}


