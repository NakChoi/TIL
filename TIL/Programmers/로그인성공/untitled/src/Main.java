public class Main {
    public static void main(String[] args) {

        String[] id_pw = new String[]{"meosseugi", "1234"};
        String[][] db = new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        int check = -1;

        for(int i = 0; i < db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                check = i;
            }
        }

        if(check != -1){
            if(id_pw[1].equals(db[check][1])){
                System.out.println("login");
            }else {
                System.out.println("wrong pw");
            }
        }else {
            System.out.println("fail");
        }

    }
}