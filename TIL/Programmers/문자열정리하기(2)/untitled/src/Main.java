import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String answer = "";
        String my_string = "Bcad";


        my_string = my_string.toLowerCase();

        String[] arr = my_string.split("");
        Arrays.sort(arr);

        for(String i : arr){
            answer +=i;
        }

        System.out.println(answer);


    }
}