import java.util.ArrayList;

public class Board {
    private int board[][] = new int[24][10]; //10*20 playing area, extra 4 rows to allow pieces to drop in
    private ArrayList<Integer> piece;
    public Board(){
        piece = new ArrayList<>();
//        board[1][1] = 2;
//        board[2][3] = 2;
//        board[3][2] = 2;
//        board[5][3] = 2;
//        board[0][4] = 2;
//        board[0][5] = 2;
//        board[0][6] = 2;






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
        int which = (int)(Math.random()*7);
        if (which == 0){ //line (3,0)(4,0)(5,0)(6,0)
            piece.add(3);
            piece.add(0);
            piece.add(4);
            piece.add(0);
            piece.add(5);
            piece.add(0);
            piece.add(6);
            piece.add(0);

            piece.add(0);//piece identifier
            piece.add(0);// permutation identifier

            //(X1, y1, x2, y2, x3, y3, x4, y4, int)
        }
        if (which == 1){//Left-Z (z) (3,0)(4,0)(4, 1)(5,1)
            piece.add(3);
            piece.add(0);
            piece.add(4);
            piece.add(0);
            piece.add(4);
            piece.add(1);
            piece.add(5);
            piece.add(1);

            piece.add(1);//piece identifier
            piece.add(0);//permutation identifier
        }
        if (which == 2){//Right-Z (s) (3,1)(4,1)(4,0)(5,0)
            piece.add(3);
            piece.add(1);
            piece.add(4);
            piece.add(1);
            piece.add(4);
            piece.add(0);
            piece.add(5);
            piece.add(0);

            piece.add(2);//piece identifier
            piece.add(0);// permutation identifier

        }
        if (which == 3){//Left-L (|__) (3,0)(3,1)(4,1)(5,1)
            piece.add(3);
            piece.add(0);
            piece.add(3);
            piece.add(1);
            piece.add(4);
            piece.add(1);
            piece.add(5);
            piece.add(1);

            piece.add(3);//piece identifier
            piece.add(0);// permutation identifier

        }
        if (which == 4){//Right-L (__|) (3,1)(4,1)(5,1)(5,0)
            piece.add(3);
            piece.add(1);
            piece.add(4);
            piece.add(1);
            piece.add(5);
            piece.add(1);
            piece.add(5);
            piece.add(0);

            piece.add(4);//piece identifier
            piece.add(0);// permutation identifier

        }
        if (which == 5){//Square (4,0)(5,0)(4,1)(5,1)
            piece.add(4);
            piece.add(0);
            piece.add(5);
            piece.add(0);
            piece.add(4);
            piece.add(1);
            piece.add(5);
            piece.add(1);

            piece.add(5);//piece identifier
            piece.add(0);// permutation identifier

        }
        if (which == 6){//T (3,1)(4,1)(5,1)(4,0)
            piece.add(3);
            piece.add(1);
            piece.add(4);
            piece.add(1);
            piece.add(5);
            piece.add(1);
            piece.add(4);
            piece.add(0);

            piece.add(6);//piece identifier
            piece.add(0);// permutation identifier

        }
    }
    public ArrayList getPiece(){
        return piece;
    }
    public int getBlocks(int i){
        return piece.get(i);
    }
    public int getPieceSize(){
        return piece.size();
    }
}
