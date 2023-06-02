public class Main {
    public static void main(String[] args) {

        String[] quiz = new String[]{"3 - 4 = -3", "5 + 6 = 11"};
        String[] answer = new String[quiz.length];

        int sum = 0;
        String O_X = "O";

        for (int i = 0; i < quiz.length; i++){
            String[] str_arr = quiz[i].split(" ");
            sum = Integer.parseInt(str_arr[0]);

            for (int j = 1; j < str_arr.length; j++ ) {

                // +
                if(str_arr[j].equals("+")){
                    sum += Integer.parseInt(str_arr[j+1]);

                    // -
                }else if(str_arr[j].equals("-")){
                    sum -= Integer.parseInt(str_arr[j+1]);
                }else if(str_arr[j].equals("=")){
                    if(Integer.parseInt(str_arr[j+1]) == sum){
                        O_X = "O";
                        break;
                    }else {
                        O_X = "X";
                        break;
                    }
                }


            }

            answer[i] = O_X;

        }

        for (String i : answer) {
            System.out.println(i);
        }

    }
}