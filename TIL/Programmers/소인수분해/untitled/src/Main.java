import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int n = 12;
        int i = 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(n!=1){
            if(n%i ==0) {
                n = n/i;
                if(map.get(i) != null){
                    map.put(i, map.get(i)+1);
                }else{
                    map.put(i, 1);
                }
            }else {
                i++;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Integer num : map.keySet()){
            arrayList.add(num);
        }

        int[] answer = new int[arrayList.size()];

        for(int j = 0; j < answer.length; j++){
            answer[j] = arrayList.get(j);
        }

        for (int answer_i : answer){
            System.out.println(answer_i);
        }

        Arrays.sort(answer);
    }
}