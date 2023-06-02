public class Main {
    public static void main(String[] args) {

        String answer = "";
        String my_string = "hello";

        int num1 = 1;
        int num2 = 2;

        String str = "";

        String[] my_string_array = new String[my_string.length()];

        for(int i = 0; i < my_string.length(); i++){
            my_string_array[i] = String.valueOf(my_string.charAt(i));
        }

        for(int i = 0; i < my_string_array.length; i++){
            if(i == num1){
                str = my_string_array[i];

                my_string_array[i] = my_string_array[num2];

                my_string_array[num2] = str;
            }
        }

        for (String i : my_string_array){
            System.out.println(i);
        }

    }
}