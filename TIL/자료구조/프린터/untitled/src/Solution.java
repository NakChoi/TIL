import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int queuePrinter(int bufferSize, int capacities, Integer[] documents) {

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(documents));

        int second = 0;
        int cap = 0;

        Queue<Integer> buffer = new LinkedList<>();

        for(int i = 0; i < bufferSize; i++){
            buffer.add(0);
        }

        while(queue.peek() != null ){
            // 버퍼 이동
            buffer.poll();


            int i = queue.peek();


            if(cap + i <= capacities){
                // 맨 앞 값 빼기

                buffer.add(queue.poll());
            }


            if(buffer.size() <2){
                buffer.add(0);
            }
            // 초
            second++;


        }






        return 1;
    }
}
