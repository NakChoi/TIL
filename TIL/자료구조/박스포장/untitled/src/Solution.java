public class Solution {
    public int paveBox(Integer[] boxes) {


        int cnt = 1;
        int result = 0;



        int max = boxes[0];

        for (int i = 1; i < boxes.length; i++) {

            if (boxes[i] <= max) {
                cnt++;
            }



            if (boxes[i] > max) {
                max = boxes[i];
                result = cnt;
                cnt = 1;

            }

        }
        
        



        return result;
    }
}
