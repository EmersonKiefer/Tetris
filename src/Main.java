

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class  Main extends JPanel implements ActionListener, KeyListener {

    private Timer timer;
    private Board b;

    private boolean[] keys;


    public Main(){
         b = new Board();
         timer = new Timer(1000/5, this);
         timer.start();
         keys = new boolean[256];
         addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //moves pieces down
        //TODO: USE FOR/or/WHILE LOOP TO CHECK FOR PIECES (LOOP THROUGH EACH CELL OF PIECE TO SEE IF ANY ARE COLLIDING)
        for (int i = b.getBoard().length-2; i > 0; i--) {
            for (int j = b.getBoard()[0].length-2; j > 0; j--) {
                if(i != 21){
                    if (b.getBoard()[i][j] > 0){
                        if(b.getBoard()[i+1][j] == 0){
                            b.setCell(i+1, j, 1);
                            b.setCell(i, j, 0);
                        }
                    }
                    else{
                        b.makePiece();
                    }
                }
            }
        }

        if(keys[KeyEvent.VK_W]){
            System.out.println("W");
        }
        if(keys[KeyEvent.VK_UP]){ //rotate (right)

        }

        if(keys[KeyEvent.VK_DOWN]){ //drop

        }

        if(keys[KeyEvent.VK_SPACE]){ //drop to bottom

        }
        if(keys[KeyEvent.VK_LEFT]){//Move Left

        }
        if(keys[KeyEvent.VK_RIGHT]){ //Move Right

        }
        if(keys[KeyEvent.VK_C]){ //Hold

        }


        if(!Alive(b)){
            timer.stop();
        }
        repaint(); //test
     }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        //Draw all the things.
        g2.fillRect(240, 0, 400, 800);
        g2.setColor(new Color(0x6B6A6F));
        for (int i = 0; i < 800; i+=40) {
            g2.drawLine(240, i, 640, i);
        }
        for (int i = 0; i < 400; i+=40) {
            g2.drawLine(i +240, 0, i+240, 800);
        }
        for (int row = 0; row < b.getBoard().length; row++) {
            for (int col = 0; col < b.getBoard()[0].length; col++) {
             if(b.getVal(row, col)>0){

                 g2.fillRect(col*40+240, row*40-80, 40, 40);

             }
            }

        }






    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tetris");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,880,822);
        JPanel panel = new Main();
        panel.setFocusable(true);
        panel.grabFocus();
        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);



    }

    //Use to see if Player has lost or can continue
    public static boolean Alive(Board b) {
        for (int i = 0; i < b.getBoard()[0].length; i++) {
            if (b.getBoard()[0][i] == 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;

    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
}




// Create 2d array of zeros (the game field) that can be populated with pieces.
//
// cell class:
//  create piece permutations (four rotations of pieces)
//  make pieces move down the grid
//  double for loop that checks if a line is full(all coordinates==1)
//  remove full rows(set to zero)
//
// update class?
// LR arrow keys for left/right
//Down arrow key for Down
//Q/W for left/right

//rotation:
// Check to see if the next position is legal
// change row and col value of positive boxes

/*
line1 [r][c] [r][c-1] [r][c-2] [r][c+1] update()
line2 [



*/
//Different pieces each get their own #

//Rotation Rules:
//Each rotation gets its own number
//Player presses rotate key, check if rotation is legal, then rotate

//start with random list that identifies a piece. List contains 4 sets of coordinates and piece number ex: (1+x)(2+y) line=1, square=4
// each input(rotation/movement) changes the variable next to the coordinate, which will update the pieces