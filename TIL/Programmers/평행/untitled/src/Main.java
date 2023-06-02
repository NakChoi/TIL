public class Main {
    public static void main(String[] args) {

        int[][] dots = new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}};


        // case 1
        double x = ((double) dots[0][0] - (double) dots[1][0]);
        double y = ((double) dots[0][1] - (double) dots[1][1]);

        double x2 = ((double) dots[2][0] - (double) dots[3][0]);
        double y2 = ((double) dots[2][1] - (double) dots[3][1]);

        if( y/x == y2/x2 ){
            System.out.println("1 같당");
        }

        // case 2
        x = ((double) dots[0][0] - (double) dots[3][0]);
        y = ((double) dots[0][1] - (double) dots[3][1]);

        x2 = ((double) dots[1][0] - (double) dots[2][0]);
        y2 = ((double) dots[1][1] - (double) dots[2][1]);

        if( y/x == y2/x2 ){
            System.out.println("2 같당");
        }

        // case 3

        x = ((double) dots[0][0] - (double) dots[2][0]);
        y = ((double) dots[0][1] - (double) dots[2][1]);

        x2 = ((double) dots[1][0] - (double) dots[3][0]);
        y2 = ((double) dots[1][1] - (double) dots[3][1]);

        if( y/x == y2/x2 ){
            System.out.println("3 같당");
        }



    }

    public double cal_inclination(int[][] a, int[][] b){
        int answer = 0;

        //answer = (a[][1] - b[][1] )/();
        return 1;
    }

}