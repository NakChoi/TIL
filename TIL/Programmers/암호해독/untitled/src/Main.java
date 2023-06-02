public class Main {
    public static void main(String[] args) {
        String answer = "";

        String cipher = "dfjardstddetckdaccccdegk";
        int code =  4;

        String space = " ";
        cipher = space+ cipher;
        for(int i =1; i <cipher.length(); i++){
            if(i%code ==0){
                answer += String.valueOf(cipher.charAt(i));
            }
        }
        System.out.println(answer);
    }
}


