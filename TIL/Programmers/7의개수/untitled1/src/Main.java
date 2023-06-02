import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        int answer = 0;
        String my_string = "3 + 4";
        String[] str_arr = my_string.split(" ");


        for(int i = 0; i < str_arr.length; i++){
            if(str_arr[i].equals("-")){
                str_arr[i+1] = "-"+str_arr[i+1];
            }else if(str_arr[i].equals("+")){

            }else {
                answer += Integer.valueOf(str_arr[i]);
            }
        }


        System.out.println(answer);


    }
}