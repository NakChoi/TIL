public class Main {
    public static void main(String[] args) {


        String numbers = "onetwothreefourfivesixseveneightnine";
        String answer = "";

        String str = "";

        for(int i = 0; i < numbers.length(); i++){

            str += numbers.charAt(i);

            if(str.equals("one")){
                answer += "1";
                str = "";
            }else if(str.equals("two")){
                answer += "2";
                str = "";
            }else if(str.equals("three")){
                answer += "3";
                str = "";
            }else if(str.equals("four")){
                answer += "4";
                str = "";
            }else if(str.equals("five")){
                answer += "5";
                str = "";
            }else if(str.equals("six")){
                answer += "6";
                str = "";
            }else if(str.equals("seven")){
                answer += "7";
                str = "";
            }else if(str.equals("eight")){
                answer += "8";
                str = "";
            }else if(str.equals("nine")){
                answer += "9";
                str = "";
            }else if (str.equals("zero")){
                answer += "0";
                str = "";
            }else{
                continue;
            }
        }

        System.out.println(Long.valueOf(answer));

    }
}