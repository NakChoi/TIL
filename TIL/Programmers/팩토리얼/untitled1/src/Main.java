public class Main {
    public static void main(String[] args) {
        int answer = 1;
        int n = 3628800;

        int var = 1;

        while (answer < n) {
            answer *= var;

            if(answer > n){
                var--;
                break;
            }else if(answer == n){
                break;
            }else{
                var++;
            }
        }

        System.out.println(var);



        System.out.println("answer : " + answer);
    }
}