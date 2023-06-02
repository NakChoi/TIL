public class Main {
    public static void main(String[] args) {
        String answer = "";
        String my_string = "abCdEfghIJ";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i = 0; i < my_string.length(); i++){
            if(upper.contains(String.valueOf(my_string.charAt(i)))){
                answer += String.valueOf(my_string.charAt(i)).toLowerCase();
            }else {
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            }
        }

        System.out.println(answer);
    }
}


