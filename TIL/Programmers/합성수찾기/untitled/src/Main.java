public class Main {
    public static void main(String[] args) {

        int answer = 0;
        int n = 15;
        int cnt = 0;

        for(int i = 4; i <=n; i++){
            for (int j = 1; j <=i; j++){
                if(i%j == 0){
                  cnt++;
                }
            }
            if(cnt >=3){
                answer++;
            }
            cnt = 0;
        }

        System.out.println(answer);
    }
}