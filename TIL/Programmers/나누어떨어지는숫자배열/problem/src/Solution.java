import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {

        int length = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i]%divisor ==0){
                length++;
            }
        }

        if(length ==0) return new int[]{-1};

        int[] answer = new int[length];

        int cnt = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i]%divisor ==0){
                answer[cnt++] = arr[i];

            }
        }

        Arrays.sort(answer);








        return answer;
    }
}
