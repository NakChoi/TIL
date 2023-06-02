public class Main {
    public static void main(String[] args) {

        String[] babbling = new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        String[] four_pronounce = new String[]{"aya", "ye", "woo", "ma"};


        int cnt = 0;
        // babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장한다.

        for(int i = 0; i < babbling.length; i++){
            String str = babbling[i];
            for(int j = 0; j < four_pronounce.length; j++){

                if(str.contains(four_pronounce[j])){
                    str = str.replace(four_pronounce[j], " ".repeat(four_pronounce[j].length()));
                    System.out.println(str);
                }
            }
            if(str.equals(" ".repeat(babbling[i].length()))) cnt++;
        }

        System.out.println(cnt);

    }
}