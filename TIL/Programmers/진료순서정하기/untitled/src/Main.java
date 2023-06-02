public class Main {
    public static void main(String[] args) {
        int[] emergency = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] answer = new int[emergency.length];

        int order = 1;

        for(int i =0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    order++;
                }
            }
            answer[i] = order;
            order= 1;
        }


    }
}