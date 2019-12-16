package finalproject;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Screen extends JPanel implements ActionListener, KeyListener {
    
    
    
    Timer t = new Timer(10, this);

    //Creates a new player located at 0,0 with a size of 10 and a speed of 0.
    Player p = new Player(0, 0, 20, 20, 0, 0);

  

    public Screen() {
        addKeyListener(this);
        setFocusable(true);
        

        t.start();
    }

    public void actionPerformed(ActionEvent arg0) {

        //Runs the player "tick", moving the player.
        p.move();
        
        
        
        //Repaints the screen.
        repaint();
        
        

    }

    //Draws the screen.
    public void paint(Graphics g) {

        g.clearRect(0, 0, getWidth(), getHeight());
        
        p.draw(g);

    }

    public void keyPressed(KeyEvent k) {

        switch (k.getKeyCode()) {

            //Runs whenever the "D" key is pressed down.
            case KeyEvent.VK_RIGHT:

                //Sets the speed for x to move 1 to the right each frame.
                p.setDirection("right");
                break;

            //Runs whenever the "S" key is pressed down.
            case KeyEvent.VK_DOWN:
                //Sets the speed for y to move 1 down each frame.

                p.setDirection("down");

                break;

            //Runs whenever the "A" key is pressed down
            case KeyEvent.VK_LEFT:
                //Sets the speed for x to move 1 to the left each frame.

                p.setDirection("left");

                break;

            //Runs whenever the "W" key is pressed down.
            case KeyEvent.VK_UP:
                //Sets the speed for y to move 1 down each frame.

                p.setDirection("up");

                break;
        }

    }

    public long walkTime;
    public long startWalkTime;
    


    public void keyReleased(KeyEvent k) {

        switch (k.getKeyCode()) {

            //Runs whenever the "D" key is pressed down.
            case KeyEvent.VK_RIGHT:
                //Sets the speed for x to 0 whenever the player releases the "D" key.
                
                p.setStanding("right");

                
                p.setDirection("none");

                p.setSpeedX(0);
                break;

            //Runs whenever the "S" key is pressed down.
            case KeyEvent.VK_DOWN:
                
                p.setStanding("down");

                
                p.setDirection("none");
                
                //Sets the speed for y to move 1 down each frame.
                p.setSpeedY(0);
                break;

            //Runs whenever the "A" key is pressed down
            case KeyEvent.VK_LEFT:
                
                p.setStanding("left");
                
                p.setDirection("none");
                
                //Sets the speed for x to move 1 to the left each frame.
                p.setSpeedX(0);
                break;

            //Runs whenever the "W" key is pressed down.
            case KeyEvent.VK_UP:
                
                p.setStanding("up");
                

                p.setDirection("none");
                
                //Sets the speed for y to move 1 down each frame.
                p.setSpeedY(0);
                break;
        }

    }

    public void keyTyped(KeyEvent k) {

    }
}