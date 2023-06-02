public class Main {
    public static void main(String[] args) {

        String answer = "";
        String str = "nice to meet you";

        String vowels = "a,e,i,o,u";

        for(int i = 0; i <str.length(); i++){
            if(vowels.contains(String.valueOf(str.charAt(i)))){

            }else {
                answer+= str.charAt(i);
            }
        }

        System.out.println(answer);

    }
}


