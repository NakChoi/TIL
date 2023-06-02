public class Main {
    public static void main(String[] args) {


        String[] spell = new String[]{"p", "o", "s"};
        String[] dic = new String[]{"sod", "eocd", "qixm", "adio", "soo"};

        for(int i = 0; i < dic.length; i++){
            for(int j = 0; j < spell.length; j++ ){
                if(dic[i].contains(spell[j])){
                    if(j == spell.length-1){
                        System.out.println(1);
                    }
                    continue;
                }else{
                    break;
                }
            }
        }

        System.out.println(2);
    }
}