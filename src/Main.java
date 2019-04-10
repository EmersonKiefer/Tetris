

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class  Main extends JPanel implements ActionListener {

    private Timer timer;
    private static Board b;

    public Main(){
         b = new Board();
         timer = new Timer(1000/60, this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //moves pieces down
        for (int i = b.getBoard().length-1; i > 0; i--) {
            for (int j = b.getBoard()[0].length-1; j > 0; j--) {
                if (b.getBoard()[i][j] == 1){
                    if(b.getBoard()[i+1][j] == 0){
                        b.setCell(i+1, j, 1);
                        b.setCell(i, j, 0);
                    }
                }

            }

        }

        if(!Alive()){
            timer.stop();
        }
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
    public static boolean Alive() {
        for (int i = 0; i < b.getBoard()[0].length; i++) {
            if (b.getBoard()[0][i] == 1) {
                return false;
            }
        }
        return true;
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
