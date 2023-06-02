public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3};
        String direction = "left";

        int[] answer = new int[numbers.length];
        int num;

        if(direction.equals("right")){
            num = numbers[numbers.length-1];

            for(int i = 1; i < numbers.length; i++){
                    answer[i] = numbers[i-1];
            }
            answer[0] = num;
        }else{
            num = numbers[0];

            for(int i = numbers.length-1; i > 0; i--){
                    answer[i-1] = numbers[i];
            }
            answer[numbers.length-1] = num;
        }

        for(int i : answer){
            System.out.println(i);
        }

    }
}