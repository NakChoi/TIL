public class Main {
    public static void main(String[] args) {


        int M = 2 ;
        int N = 5 ;

        if(N == 1 && M == 1){
            //return 0;
        }

        int answer = 0 ;

        answer = (M-1) + ((N-1)*M);

        System.out.println(answer);



    }
}