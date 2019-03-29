

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JPanel implements ActionListener {

    private Timer timer;
    private Board r;

    public Main(){
         r = new Board();
         timer = new Timer(1000/60, this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //moves pieces down
        for (int i = r.getBoard().length-1; i > 0; i--) {
            for (int j = r.getBoard()[0].length-1; j > 0; j--) {
                if (r.getBoard()[i][j] == 1){
                    if(r.getBoard()[i+1][j] == 0){
                        r.setCell(i+1, j, 1);
                        r.setCell(i, j, 0);
                    }
                }

            }

        }

        if(!Alive(r)){
            timer.stop();
        }
     }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        //Draw all the things.



    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tetris");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,200,222);
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

//Different pieces each get their own #
