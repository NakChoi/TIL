import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numlist = new int[]{36, 40, 20, 47, 10, 6, 7000, 10000};
        int n = 30;

        Arrays.sort(numlist);

        int[] abs_numlist = new int[numlist.length];

        for(int i = 0; i < numlist.length; i++){

            abs_numlist[i] = Math.abs(numlist[i]-n);
        }

        int[] answer = new int[numlist.length];

        // [3, 2, 1, 0, 1, 2]

        int cnt = 0;
        int dupl = 0;

        for(int i = 0 ; i < abs_numlist.length; i++){

            for(int j = 0; j < abs_numlist.length; j++){

                if(abs_numlist[i] == abs_numlist[j] && i < j){
                    dupl++;
                }else if(abs_numlist[i] > abs_numlist[j]){
                    cnt++;
                }
            }

            answer[dupl+cnt] = numlist[i];
            dupl= 0;
            cnt = 0;

        }

        for(int i : answer){
            System.out.println(i);
        }



    }
}