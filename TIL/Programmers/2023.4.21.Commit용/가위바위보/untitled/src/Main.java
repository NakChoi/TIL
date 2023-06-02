public class Main {
    public static void main(String[] args) {
        String answer = "";
        String rsp = "205";

        for (int i = 0; i <rsp.length(); i++){
            if(rsp.charAt(i) =='2'){
                answer += "0";
            }else if(rsp.charAt(i) =='0'){
                answer += "5";
            }else{
                answer += "2";
            }
        }
        System.out.println(answer);
    }
}