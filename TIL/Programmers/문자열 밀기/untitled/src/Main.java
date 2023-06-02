public class Main {
    public static void main(String[] args) {



        String A = "atat";
        String B = "tata";


        for(int i = 1; i < A.length(); i++) {

            String subStr_backward = A.substring(A.length()-i);
            String subStr_forward = A.substring(0, A.length()-i);

            String add_String = subStr_backward + subStr_forward;

            if(add_String.equals(B)){
                System.out.println(i);
                break;
            }
        }

        System.out.println(2);
    }
}