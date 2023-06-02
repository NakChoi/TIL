import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String my_string = "hi12392";

        String nums = "1,2,3,4,5,6,7,8,9,0";
        int len = 0;

        for(int i = 0; i < my_string.length(); i++){

            if(nums.contains(String.valueOf(my_string.charAt(i)))){
                len++;
            }
        }

        int[] answer = new int[len];
        int idx = 0;
        for(int i = 0; i < my_string.length(); i++){

            if(nums.contains(String.valueOf(my_string.charAt(i)))){
                answer[idx++] = Integer.valueOf(String.valueOf(my_string.charAt(i)));
            }
        }

        Arrays.sort(answer);

        for(int i : answer){
            System.out.println(i);
        }
    }
}