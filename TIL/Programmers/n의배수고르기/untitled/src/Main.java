public class Main {
    public static void main(String[] args) {

        int[] numlist = new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 3;
        int len = 0;
        int idx = 0;

        for (int num : numlist){
            if(num%n == 0){
                len++;
            }
        }

        int[] answer = new int[len];

        for (int num : numlist){
            if(num%n == 0){
               answer[idx++] = num;
               System.out.println(num);
            }
        }

    }
}