import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.

        int[] sides = new int[]{3,6};

        int answer = 0;

        int cnt = 0;

        // 배열 중 하나가 가장 긴 변일 경우.    3+a > 6 , a >= 6

        int long_side = Math.max(sides[0], sides[1]);
        int second_side = Math.min(sides[0], sides[1]);

        int a = long_side - second_side+1;

        while(a <= long_side){
            a++;
            cnt++;
        }


        // 나머지 하나가 가장 긴 변일 경우.  sides[0] + sides[1] > long_side

        int b = long_side+1;

        while(sides[0]+sides[1] > b){
            b++;
            cnt++;
        }

        System.out.println(cnt);

    }
}