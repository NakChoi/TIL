

public class Main {
    public static void main(String[] args) {


        int num = 3;
        int total = 12;

        int start = (2*total/num + 1 - num) / 2;


        int[] answer = new int[num];

        for(int i = 0; i < 3; i++){
            answer[i] = start +i;
        }

        for (int i : answer) {
            System.out.println(i);
        }

    }

}