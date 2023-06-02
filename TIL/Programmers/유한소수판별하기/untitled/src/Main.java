public class Main {
    public static void main(String[] args) {

        int a = 12;
        int b = 21;

        int gcd = GCD(Math.max(a,b), Math.min(a,b));

        a = a/gcd;
        b = b/gcd;

        while(b != 1){
            if(b % 5 == 0){
                b = b/5;
            }else if(b % 2 == 0){
                b = b/2;
            }else {
                System.out.println(2);
            }
        }

        System.out.println(1);

    }

    public static int GCD(int top, int bottom){
        while(bottom != 0){
            int r = top%bottom;
            top = bottom;
            bottom = r;
        }

        return top;
    }
}