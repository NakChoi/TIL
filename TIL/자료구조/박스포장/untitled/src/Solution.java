public class Solution {
    public int paveBox(Integer[] boxes) {


        int cnt = 1;
        int result = 1;



        int max = boxes[0];

        for (int i = 1; i < boxes.length; i++) {

            if (boxes[i] <= max) {
                cnt++;
            }



            if (boxes[i] > max) {
                max = boxes[i];
                if(result < cnt){
                    result = cnt;
                }
                cnt = 1;

            }

            // 마지막까지 갈경우
            if(i == boxes.length -1 ){
                if(result < cnt){
                    result = cnt;
                }
            }


        }
        
        



        return result;
    }
}
