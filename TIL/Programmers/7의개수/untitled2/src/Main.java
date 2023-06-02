import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        int balls = 3;
        int share = 2;

        int n = balls;
        int m = share;




        BigInteger answer = factorial(n).divide((factorial(n-m).multiply(factorial(m))));

        System.out.println(answer);

    }

    public static BigInteger factorial(int a){


        BigInteger answer = new BigInteger("1");
        int i = a;

        while(i !=0){

            BigInteger num2 = new BigInteger(String.valueOf(i));
            answer = answer.multiply(num2);
            i--;
        }

        return answer;
    }
}