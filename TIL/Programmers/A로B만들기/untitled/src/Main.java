public class Main {
    public static void main(String[] args) {
        String answer = "";
        String answer2 = "";

        String before = "olleh";
        String[] before_arr = before.split("");

        String after = "hello";
        String[] after_arr = after.split("");

        for (int i =0; i < before_arr.length; i++){
         for(int j = 0; j < after_arr.length; j++){
            if(before_arr[i].equals(after_arr[j])){
                before_arr[i] = "";
                after_arr[j] = "";
                break;
            }
         }
        }

        for(int i = 0; i < before_arr.length; i++){
            answer += before_arr[i];
        }

        for(int i = 0; i < after_arr.length; i++){
            answer2 += after_arr[i];
        }

        if(answer.equals(answer2)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }


    }
}