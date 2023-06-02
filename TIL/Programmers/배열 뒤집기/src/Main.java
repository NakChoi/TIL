public class Main {
    public static void main(String[] args) {

        int[] num_list = new int[]{1, 2, 3, 4, 5};

        int[] answer = new int[num_list.length];


        for (int i = num_list.length - 1; i >= 0; i--) {

            answer[num_list.length - 1 - i] = num_list[i];

        }

        for(int i : answer){
            System.out.println(i);
        }

    }
}