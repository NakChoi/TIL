public class Main {
    public static void main(String[] args) {


        int n = 20;

        int cnt = 0;


        for(int i = 1; i <= Math.sqrt(n); i++){

            if(n% i ==0){
                cnt++;
            }
        }

        if( n % Math.sqrt(n) != 0){
            cnt *=2;
        }else {
            cnt = (cnt *2)-1;
        }

        System.out.println(cnt);

    }
}