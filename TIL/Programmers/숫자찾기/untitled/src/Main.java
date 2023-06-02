public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int num = 29183;
        int k = 1;

        String[] arr = String.valueOf(num).split("");

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(String.valueOf(k))){
                answer = i;
                break;
            }
        }



        System.out.println(answer+1);

    }
}