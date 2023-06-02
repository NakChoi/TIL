public class Main {
    public static void main(String[] args) {

        int answer = 0;
        int n = 144;

        if(n%Math.sqrt(n)==0){
            answer =1;
        }else {
            answer = 2;
        }
        System.out.println(answer);

    }
}