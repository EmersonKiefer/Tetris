import java.util.ArrayList;

public class Board {
    private int board[][] = new int[24][10]; //10*20 playing area, extra 4 rows to allow pieces to drop in

    public Board(){
        board[2][1] = 1;
        board[2][2] = 1;





    }

    public void setCell(int col, int row, int num){
        board[col][row] = num;
    }

    public int[][] getBoard() {
        return board;
    }

    public void printArr(){
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[0].length; j++) {
                System.out.println(board[i][j]);

            }
        }
    }
    public int getVal(int col, int row){
        return board[col][row];
    }
}
