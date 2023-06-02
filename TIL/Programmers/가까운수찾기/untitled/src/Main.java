import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{3, 10, 28};
        int n = 20;
        int answer = 0;

        Arrays.sort(array);

        int closed_num = n- array[0];

        for(int i = 0; i < array.length; i++){
            if(Math.abs(n - array[i]) < closed_num){
                closed_num = Math.abs(n - array[i]);
                answer = array[i];
            }
        }

        System.out.println(answer);
    }
}