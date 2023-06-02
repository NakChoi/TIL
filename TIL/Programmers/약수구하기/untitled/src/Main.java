public class Main {
    public static void main(String[] args) {

        int n = 24 ;
        int len = 0;

        for(int i = 1; i <= n; i++){
            if(n%i==0){
                len++;
            }
        }

        int[] answer = new int[len];
        int idx = 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                answer[idx++] = i;
            }
        }

        for(int i : answer){
            System.out.println(i);
        }

    }
}