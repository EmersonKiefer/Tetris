import java.util.ArrayList;

public class Board {
    private int board[][] = new int[24][10]; //10*20 playing area, extra 4 rows to allow pieces to drop in

    public Board(int[][]){
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                System.out.println(board[i][j]);
//            }
//        }


    }

    public void printArr(){
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[0].length; j++) {
                System.out.println(board[i][j]);

            }
        }
    }
}
