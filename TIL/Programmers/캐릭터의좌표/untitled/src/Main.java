public class Main {
    public static void main(String[] args) {

        String[] keyinput = new String[]{"down", "down", "down", "down", "down"};

        int[] board = new int[]{7,9};

        int[] answer = new int[]{0, 0};

        int x_limit = (board[0])/2;
        int y_limit = (board[1])/2;


        for(String str : keyinput){

            if(str.equals("left")){
                if(answer[0] - 1 < -x_limit ){

                }else {
                    answer[0] = answer[0] - 1;
                }

            }else if(str.equals("right")){
                if(answer[0] + 1 > x_limit ){

                }else {
                    answer[0] = answer[0] + 1;
                }
            } else if (str. equals("up")) {
                if(answer[1] + 1 > y_limit ){

                }else {
                    answer[1] = answer[1] + 1;
                }
            } else{
                if(answer[1] - 1 < -y_limit ){

                }else {
                    answer[1] = answer[1] - 1;
                }
            }
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);



    }
}