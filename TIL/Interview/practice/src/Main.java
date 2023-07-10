import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        int len = arr.length;

        int val = 2;
        boolean isEven = false;

        for(int i = 0; i < len; i++){
            for (int j = 0; j < len; j++) {
                if(i%2 == 0){
                    if(!isEven){
                        if(j == 2){
                            arr[i][j] = val;
                            val +=2;
                        }
                    }else {
                        if(j % 2 == 0){
                            arr[i][j] = val;
                            val +=2;
                        }
                    }
                }else {
                    if(j%2 != 0){
                        arr[i][j] = val;
                        val +=2;
                    }
                }
            }

            isEven = true; // 실수한 부분 1

        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println();
        System.out.println("==================================================================");
        System.out.println();

        BlackMarker blackMarker = new BlackMarker(10,10,10,10);

        System.out.println(blackMarker.getColor());
        System.out.println(blackMarker.getWidth());
        System.out.println(blackMarker.getLength());
        System.out.println(blackMarker.getLineWidth());
        System.out.println(blackMarker.getInkCapacity());

        blackMarker.isCapOpened();
        blackMarker.openCap();
        blackMarker.closeCap();
        blackMarker.write();
        blackMarker.openCap();
        blackMarker.write();
        blackMarker.refillInk();

        System.out.println(blackMarker.getInkCapacity());


    }
}