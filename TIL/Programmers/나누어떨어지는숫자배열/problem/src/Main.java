public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] arr = new int[]{5, 9, 7, 10};
        int divisor = 5;

        for (int i : solution.solution(arr, divisor)){
            System.out.println(i);
        }
    }
}