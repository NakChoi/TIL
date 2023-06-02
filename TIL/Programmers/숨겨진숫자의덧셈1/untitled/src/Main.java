public class Main {
    public static void main(String[] args) {
        int answer = 0;
        String my_string = "aAb1B2cC34oOp";
        String nums ="1234567890";
        for(int i = 0; i < my_string.length(); i++){
            if(nums.contains(String.valueOf(my_string.charAt(i)))){
                answer += Integer.valueOf(String.valueOf(my_string.charAt(i)));
            }
        }
        System.out.println(answer);
    }
}