public class Main {
    public static void main(String[] args) {

        String bin1 = "100001";
        String bin2 = "1010101";

        String answer = "";

        if(bin1.length() != bin2.length()){
            if(bin1.length() > bin2.length()){
                bin2 = "0".repeat(bin1.length() - bin2.length())+bin2;
            }else if (bin1.length() < bin2.length()){
                bin1 = "0".repeat(bin2.length() - bin1.length())+bin1;
            }
        }

        System.out.println("bin1 : " + bin1);
        System.out.println("bin2 : " + bin2);

        int var = 0;
        
        for(int i = bin1.length()-1; i>=0; i--){
            if(Integer.valueOf(bin1.charAt(i)+"") + Integer.valueOf(bin2.charAt(i)+"") + var == 2){
                answer = "0" +  answer;
                var = 1;
            }else if (Integer.valueOf(bin1.charAt(i)+"") +Integer.valueOf(bin2.charAt(i)+"") + var > 2){
                answer = "1" +  answer;
                var = 1;
            }else if(Integer.valueOf(bin1.charAt(i)+"") +Integer.valueOf(bin2.charAt(i)+"") + var < 2){
                answer = (Integer.valueOf(bin1.charAt(i)+"") +Integer.valueOf(bin2.charAt(i)+""))+ var+ answer;
                var = 0;
            }
        }


        System.out.println(var == 1 ? "1"+answer : answer );


    }
}