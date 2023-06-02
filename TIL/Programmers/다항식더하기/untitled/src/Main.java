import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        String polynomial = "x + x + x";

        String[] str_arr = polynomial.split(" ");

        int cnt = 0;
        int num_cnt = 0;


        for(String i : str_arr){

            if(i.contains("x")){
                if ("123456789".contains(i.charAt(0)+"")) {
                    cnt += Integer.parseInt(i.replace("x", ""));

                }else {
                    cnt++;
                }

            }else if(!i.equals("+")){
                num_cnt += Integer.parseInt(i);

            }
        }


        String x = "x";

        if(cnt == 1 && num_cnt != 0){
            String answer = x +" + "+num_cnt;

        }else if(cnt == 1){
            String answer = x;
        }else if(num_cnt == 0){
            String answer = cnt+x;

        }else if(cnt == 0){
            String answer = ""+num_cnt;

        }else {
            String answer = cnt+x+ " + " + num_cnt;

        }









    }
}