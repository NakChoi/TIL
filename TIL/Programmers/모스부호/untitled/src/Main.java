import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String letter = ".... . .-.. .-.. ---";
        String answer = "";

        HashMap<String, String> map = new HashMap<>(){};

        String alphabet = "a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";

        String[] alpha_arr = alphabet.split(", ");

        String[] arr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], alpha_arr[i]);
        }

        String[] letter_arr = letter.split(" ");

        for(int i = 0; i < letter_arr.length; i++){
            System.out.println(map.get(letter_arr[i]));
            answer += map.get(letter_arr[i]);
        }





    }
}