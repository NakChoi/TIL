import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] lines = new int[][]{{0, 1}, {1, 2}, {2, 3}};

        int answer = 0;
        int[] arr = new int[200]; // -100 ~ 100 까지니까


        for(int i = 0; i < lines.length; i++){
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++){
                arr[j]++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i]>1){
                answer++;
            }
        }

        System.out.println(answer);

    }
}