import java.util.ArrayList;

public class Board {
    private int board[][] = new int[24][10]; //10*20 playing area, extra 4 rows to allow pieces to drop in

    public Board(){
        board[10][3] = 1; //set random x,y to one for testing.
        board[10][4] =  2;

//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                System.out.println(board[i][j]);
//            }
//        }


    }

    public void setCell(int col, int row, int num){ //gives cells numbers
        board[col][row] = num;
    }

    public int[][] getBoard() {
        return board;
    }

    public int getVal(int col, int row){
        return board[col][row];
    }





}
