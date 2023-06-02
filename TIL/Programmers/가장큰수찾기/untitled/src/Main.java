public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{1,8,3};
        int[] answer = new int[2];

        int max = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                answer[0] = array[i];
                answer[1] = i;
                max = array[i];
            }
        }

        for(int i : answer){
            System.out.println(i);
        }
    }
}