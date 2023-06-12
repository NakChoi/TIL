import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int queuePrinter(int bufferSize, int capacities, int[] documents) {

        Integer[] arr = new Integer[documents.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = documents[i];
        }

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(arr));

        int second = 0;
        int cap = 0;

        Queue<Integer> buffer = new LinkedList<>();

        for(int i = 0; i < bufferSize; i++){
            buffer.add(0);
        }

        while( buffer.peek() != null ){
            // 버퍼 이동
            cap -= buffer.poll();


            Integer i = queue.peek();


            if(i != null && cap + i <= capacities){
                // 맨 앞 값 빼기

                Integer pop = queue.poll();
                buffer.add(pop);
                cap += pop;
            }else {
                if(i != null){
                    buffer.add(0);
                }

            }

            // 초
            second++;


        }

        return second;
    }
}
