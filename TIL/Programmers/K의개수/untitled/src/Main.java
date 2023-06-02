public class Main {
    public static void main(String[] args) {

        int i = 10;
        int j = 50;
        int k = 5;

        int answer = 0;
        for(int idx = i; idx <= j; idx++){
            String[] arr = String.valueOf(idx).split("");
            for(int i1 = 0; i1 <arr.length; i1++){
                if(arr[i1].equals(String.valueOf(k))){
                    answer++;
                }
            }
        }

        System.out.println(answer);

        String a = k+"";

    }
}