public class Main {
    public static void main(String[] args) {


        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        int k = 5;

        int var = 1;
        int idx = 0;

        while (var != k){

            idx += 2;

            idx = idx%(numbers.length);

            var++;
        }

        System.out.println(numbers[idx]);
    }
}