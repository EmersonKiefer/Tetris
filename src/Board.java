import java.util.ArrayList;

public class Board {
    private int board[][] = new int[24][10]; //10*20 playing area, extra 4 rows to allow pieces to drop in

    public Board(){






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

    public void makePiece(){
        int which = (int)(Math.random()*8);
        if (which == 0){

            //(X1, y1, x2, y2, x3, y3, x4, y4, int)
        }
        if (which == 1){

        }
        if (which == 2){

        }
        if (which == 3){

        }
        if (which == 4){

        }
        if (which == 5){

        }
        if (which == 6){

        }
        if (which == 7){
            
        }
    }
}
