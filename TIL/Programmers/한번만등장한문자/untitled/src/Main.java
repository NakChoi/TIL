import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String s = "abdc";
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(map.get(String.valueOf(s.charAt(i))) != null){
                map.put(String.valueOf(s.charAt(i)), map.get(String.valueOf(s.charAt(i)))+1);
            }else {
                map.put(String.valueOf(s.charAt(i)), 1);
            }
        }

        for(String i : map.keySet()){
            if(map.get(i) == 1){
                answer += i;
            }
        }

        String[] arr = answer.split("");

        Arrays.sort(arr);
        answer = "";

        for(String str : arr){
            answer+= str;
        }

        System.out.println(answer);
        System.out.println((int)'a');
    }
}