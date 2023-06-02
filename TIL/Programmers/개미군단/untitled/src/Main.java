public class Main {
    public static void main(String[] args) {


        int answer = 0;
        int hp = 999;

        int general = 5;
        int soldier = 3;
        int work = 1;

        // 장군
          answer += hp/general;
          hp = hp%general;

        // 병정
          answer += hp/soldier;
          hp = hp % soldier;

          // 일개미
          answer += hp/work;

        System.out.println(answer);
    }
}