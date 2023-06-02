import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};

        int[][] check_board = new int[board.length+2][board.length+2];

        // check board 0으로 채우기
        for(int i = 0; i < check_board.length; i++){
            for (int j = 0; j < check_board.length; j++) {
                check_board[i][j] = 0;
            }
        }

        // 지뢰 찾기
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    int check_board_x = i +1;
                    int check_board_y = j +1;
                    check_board[check_board_x][check_board_y] = 1;


                    // 0 이여야 한다. (중복)
                    // i -1 층
                    if(check_board[check_board_x- 1][check_board_y + 1]  == 0){

                        check_board[check_board_x- 1][check_board_y + 1] = 1;
                    }

                    if(check_board[check_board_x - 1][check_board_y] == 0){
                        check_board[check_board_x - 1][check_board_y] = 1;
                    }

                    if (check_board[check_board_x - 1][check_board_y - 1] == 0) {
                        check_board[check_board_x - 1][check_board_y - 1] = 1;
                    }

                    // i 층
                    if (check_board[check_board_x][check_board_y - 1] == 0) {
                        check_board[check_board_x][check_board_y - 1] = 1;
                    }

                    if (check_board[check_board_x][check_board_y + 1] == 0) {
                        check_board[check_board_x][check_board_y + 1] = 1;
                    }

                    // i + 1 층
                    if (check_board[check_board_x + 1][check_board_y - 1] == 0) {
                        check_board[check_board_x + 1][check_board_y - 1] = 1;
                    }

                    if(check_board[check_board_x + 1][check_board_y] == 0){
                        check_board[check_board_x + 1][check_board_y] = 1;
                    }

                    if (check_board[check_board_x + 1][check_board_y + 1] == 0) {
                        check_board[check_board_x + 1][check_board_y + 1] = 1;
                    }
                }
            }
        }
        int cnt = 0;

        for(int i = 1; i < check_board.length-1; i++){
            for (int j = 1; j < check_board.length-1; j++) {
                if(check_board[i][j] == 0){
                    cnt++;
                }
            }
        }

        System.out.println(Arrays.deepToString(check_board));

        System.out.println(cnt);



    }
}