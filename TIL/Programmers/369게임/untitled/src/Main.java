public class Main {
    public static void main(String[] args) {

        int order = 29423;
        int answer = 0;

        String str = String.valueOf(order);

        String[] arr = str.split("");

        for(int i =0; i < arr.length; i++){
            if(Integer.valueOf(arr[i]) %3 ==0&& Integer.valueOf(arr[i])!= 0){
                answer++;
            }
        }

        System.out.println(answer);
    }
}