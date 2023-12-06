import java.util.List;

public class Main {
    public static void main(String[] args) {


        //int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //int[][] mat = new int[][]{{2,5},{8,4},{0, -1}};

        //int[][] mat = new int[][]{{1,2,3,4,5,6,7,8,9}};

        //int[][] mat = new int[][]{{1,2},{3,4}};


        int[][] mat = new int[][]{{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};


        int row = mat.length;
        int col = mat[0].length;

        int len = row *col;

        int[] answer = new int[len];


        col = 0;
        row = 0;


        answer[0] = mat[row][col];

        String direction = "UP";

        for (int i = 1; i < len; i++) {
            //System.out.println(i);
            System.out.println("row : " + row + " col : " + col);

            if (direction.equals("UP")) {
                // 끝에 도달해서 오른쪽으로 갈 것인지
                if (row - 1 < 0 && col + 1 < mat[0].length) {
                    answer[i] = mat[row][++col];
                    direction = "DOWN";

                // 아래로 갈 것인지
                }else if(row - 1 <= 0 && col + 1 >= mat[0].length){
                    answer[i] = mat[++row][col];
                    direction = "DOWN";

                // 방향으로 나아갈건지
                }else if(row - 1 >= 0 && col + 1 >= mat[0].length){
                    answer[i] = mat[++row][col];
                    direction = "DOWN";

                    // 방향으로 나아갈건지
                } else {
                    answer[i] = mat[--row][++col];
                }

            }else if (direction.equals("DOWN")) {

                // 끝에 도달해서 오른쪽으로 갈 것인지
                if (col - 1 < 0 && row + 1 < mat.length) {
                    answer[i] = mat[++row][col];
                    direction = "UP";

                    // 아래로 갈 것인지
                }else if(col - 1 >= 0 && row + 1 >= mat.length ){
                    answer[i] = mat[row][++col];
                    direction = "UP";

                    // 방향으로 나아갈건지
                }else if(col - 1 <= 0 && row + 1 >= mat.length ){
                    answer[i] = mat[row][++col];
                    direction = "UP";

                    // 방향으로 나아갈건지
                } else {
                    answer[i] = mat[++row][--col];
                }

            }

            System.out.println(" mat[i] : " + answer[i]);

        }


        // [1,2,4,7,5,3,6,8,9]

        for (int i : answer) {
            System.out.println(i);
        }
    }
}