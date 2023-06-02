public class Main {
    public static void main(String[] args) {


        String s = "1 2 Z 3";
        int answer = 0;

        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++){

            if(arr[0].equals("Z")){
                continue;
            }else if(arr[i].equals("Z")){
                answer -= Integer.parseInt(arr[i-1]);
            }else{
                answer += Integer.parseInt(arr[i]);
            }
        }

        System.out.println(answer);
    }
}