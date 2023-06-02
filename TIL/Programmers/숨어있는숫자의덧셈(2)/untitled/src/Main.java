public class Main {
    public static void main(String[] args) {

        StringBuilder answer = new StringBuilder();
        String alphabet = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z" +
                "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        alphabet = alphabet.replace(" ", "");
        String my_string = "aAb1B2cC34oOp";

        for(int i = 0; i < my_string.length(); i++ ){

            if(alphabet.contains(String.valueOf(my_string.charAt(i)))){
                answer.append(" ");
            }else{
                answer.append(my_string.charAt(i));
            }
        }

        String[] arr = answer.toString().split(" ");

        int var = 0;

        for(String i : arr){
            System.out.println(i);
        }

        for(String i : arr){
            if(!i.equals("")){
                var += Integer.parseInt(i);
            }
        }

        //System.out.println(var);

    }
}