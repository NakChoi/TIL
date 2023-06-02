public class Main {
    public static void main(String[] args) {

        String[] a = new String[]{"a", "b", "c"};
        String[] b = new String[]{"com", "b", "d", "p", "c"};

        int cnt= 0;

        for(int i =0; i <a.length; i++){

            for(int j =0; j <b.length;j++){
                if(a[i]==b[j]){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}