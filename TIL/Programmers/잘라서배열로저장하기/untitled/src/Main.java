public class Main {
    public static void main(String[] args) {


        String my_str = "abc1Addfggg4556b";
        int n = 6;
        int cnt = 1;
        int idx = 0;

        if(my_str.length()%n != 0){
            String[] answer = new String[my_str.length()/n+1];

            String str = "";
            for(int i = 0; i < my_str.length(); i++){

                str += my_str.charAt(i);
                if(cnt == n){
                    answer[idx++] = str;
                    str = "";
                    cnt = 1;
                }else if(i == my_str.length()-1){
                    answer[idx] = str;
                }else {
                    cnt++;
                }
            }

            for(String i : answer){
                System.out.println(i);
            }
        }else {
            String[] answer = new String[my_str.length()/n];
        }





    }
}