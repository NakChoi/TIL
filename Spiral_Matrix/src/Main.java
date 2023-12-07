import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //int[][] matrix = new int[][]{{1, 2, 3,}, {4, 5, 6,}, {7, 8, 9}};
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        // m x n matrix
        int m = matrix.length; // 세로
        int n = matrix[0].length; // 가로


        int[][] check = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                check[i][j] = 0;
            }
        }

        // 0은 미방문, 1은 방문
        System.out.println(Arrays.deepToString(check));


        int[] answer = new int[m*n];
        answer[0] = matrix[0][0];

        String direction = "right";

        int x = 0;
        int y = 0;

        for (int i = 1; i < m * n; i++) {

            if(direction.equals("right")){
                // 배열 밖으로 나가지 않을 때
                if (y + 1 < n) {
                    // 방문 하지 않은 곳
                    if (check[x][y+1] == 0) {
                        check[x][++y] = 1;
                        answer[i] = matrix[x][y];

                    // 방문한 곳
                    } else {
                        direction = "down";
                        i--;
                    }

                // 배열 밖으로 나갈 때
                } else {
                    direction = "down";
                    i--;
                }

            } else if (direction.equals("down")) {
                if (x + 1 < m) {
                    // 방문 하지 않은 곳
                    if (check[x + 1][y] == 0) {
                        check[++x][y] = 1;
                        answer[i] = matrix[x][y];

                    // 방문한 곳
                    } else {
                        direction = "left";
                        i--;
                    }

                    // 배열 밖으로 나갈 때
                } else {
                    direction = "left";
                    i--;
                }


            } else if (direction.equals("left")) {
                if (y - 1 >= 0) {
                    // 방문 하지 않은 곳
                    if (check[x][y - 1] == 0) {
                        check[x][--y] = 1;
                        answer[i] = matrix[x][y];

                        // 방문한 곳
                    } else {
                        direction = "up";
                        i--;
                    }

                    // 배열 밖으로 나갈 때
                } else {
                    direction = "up";
                    i--;
                }


            } else if (direction.equals("up")) {
                if (x - 1 > 0) {
                    // 방문 하지 않은 곳
                    if (check[x - 1][y] == 0) {
                        check[--x][y] = 1;
                        answer[i] = matrix[x][y];

                        // 방문한 곳
                    } else {
                        direction = "right";
                        i--;
                    }

                    // 배열 밖으로 나갈 때
                } else {
                    direction = "right";
                    i--;
                }


            }
        }



        for (int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }

    }
}