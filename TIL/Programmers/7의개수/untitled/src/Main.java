public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{7,77,17};

        int answer = 0;

        String str = "";

        for(int i = 0; i < array.length; i++){
            str = array[i]+"";
            char[] arr = str.toCharArray();
            for(int j = 0; j < arr.length; j++){
                 if(arr[j] == '7'){
                     answer++;
                 }
            }
        }
        System.out.println(answer);
    }
}