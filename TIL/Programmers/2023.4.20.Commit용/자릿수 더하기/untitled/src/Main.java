public class Main {
    public static void main(String[] args) {

        int answer = 0;
        int n = 930211;

        String str = String.valueOf(n);

        for(int i =0; i < str.length(); i++){

            answer += Integer.valueOf(String.valueOf(str.charAt(i)));
        }

        System.out.println(answer);
    }
}