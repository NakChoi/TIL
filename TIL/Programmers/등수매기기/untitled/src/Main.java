public class Main {
    public static void main(String[] args) {


        int[][] score = new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        int[] answer = new int[score.length];

        double[] average_score = new double[score.length];

        for(int i = 0; i < score.length; i++){

            average_score[i] = (double) (score[i][0] +score[i][1])/2;
        }

        int cnt = 1;

        for(int i = 0; i < average_score.length; i++){
            for(int j = 0; j < average_score.length; j++){
                if(i == j){
                    continue;
                } else if (average_score[i] < average_score[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
            cnt = 1;
        }


        for(int i : answer){
            System.out.println(i);
        }
    }
}