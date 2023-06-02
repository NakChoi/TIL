public class Main {
    public static void main(String[] args) {

        String my_string = "hello";
        String answer = "";
        String str = "";

        for(int i = 0; i < my_string.length(); i++){
            str = String.valueOf(my_string.charAt(i));
            answer += str.repeat(3);
        }
        System.out.println(answer);
    }
}