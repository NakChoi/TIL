import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        String my_string = "We are the world";
        String answer = "";

        String[] arr = my_string.split("");

        for(int i = 0; i < arr.length; i++){
            for (int j=i+1; j < arr.length; j++){
                if(arr[i].equals(arr[j])){
                    arr[j] = "";
                }
            }
        }

        for(String i : arr){
            answer+=i;
        }
        System.out.println(answer);
    }
}