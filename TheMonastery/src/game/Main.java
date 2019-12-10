/*
Ben Smith
Dec 2019 - Jan 2020
Top down 2D game.
 */
package finalproject;

import java.awt.GridLayout;
import javax.swing.JFrame;


public class Main extends JFrame {

    public Main(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Sets the title of the screen to "Java Game".
        setTitle("Java Game");
        
        //Sets the size of the screen to 400x400.
        setSize(1080, 720);
        
        //Makes it so you cannot resize the game screen.
        setResizable(false);
        
        init();

        
    }
    
    public void init(){
 
        setLocationRelativeTo(null);
        
        setLayout(new GridLayout(1,1,0,0));
        
        Screen s = new Screen();
        
        add(s);
        
        //Makes the screen visible.
        setVisible(true);
    }
    
    public static void main(String[] args) {
        
        Main f = new Main();
    }
    
}
