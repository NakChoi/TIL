public class Main {
    public static void main(String[] args) {


        int[] common = new int[]{1, 2, 3, 4};

        int answer = 0;

        // 등차 수열인지 아닌지
        boolean a = (common[1] - common[0]) == (common[2] - common[1]);


        // 등차 수열
        if(a){
            answer = common[common.length-1] + (common[1] - common[0]) ;

        // 등비 수열
        }else {
            answer = common[common.length-1] * (common[1] / common[0]) ;

        }

        System.out.println(answer);


    }
}