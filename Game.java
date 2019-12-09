/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tile.rpg;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class Game extends Canvas implements Runnable{
    //sets the width,height of the frame
    public static final int WIDTH = 360,HEIGHT = 240,SCALE = 2;
    //tracks and sees if the computer is running the game
    public static boolean running = false;
    //Helps the program multitask 
    public Thread gameThread;
    /**
     * Used to start the thread
     */
    public synchronized void start(){
        //if the game is running exit method 
        if(running)return; 
        running = true;
        //sets game thread to new thread which takes the paramiter of this class
        gameThread = new Thread(this);
        //starts this thread
        gameThread.start();
    }
    /**
     * Used to stop the thread
     */
    public synchronized void stop(){
        if(!running)return;
        running = false;
        try {
            gameThread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void run(){
        long lastTime = System.nanoTime();
        final double amountOfTicks = 60D;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
     while(running){
         long now = System.nanoTime();
         delta += (now - lastTime)/ns;
        lastTime = now;
        if(delta >= 1){
            tick();
            delta--;
        }
         render();
         
     }  
     stop();
    }
    public void tick(){
        
    }
    public void render(){
       BufferStrategy bs = this.getBufferStrategy(); 
       if(bs == null){
           createBufferStrategy(3);
           return;
       }
       Graphics g = bs.getDrawGraphics();
       //RENDER HERE
       g.fillRect(0, 0, WIDTH*SCALE, HEIGHT * SCALE);
       //END RENDER
       g.dispose();
       bs.show();
    }
    public static void main(String[] args){
        //initalizes the game class 
        Game game = new Game();
        //sets the preffred size dimensions of the frame
        game.setPreferredSize(new Dimension(WIDTH * SCALE,HEIGHT*SCALE));
        game.setMaximumSize(new Dimension(WIDTH * SCALE,HEIGHT*SCALE));
        game.setMinimumSize(new Dimension(WIDTH * SCALE,HEIGHT*SCALE));
        //creates a window 
        JFrame frame = new JFrame("Title RPG");
        //setst the size of the window 
        frame.setSize(WIDTH*SCALE,HEIGHT*SCALE);
        //Allows the user to properley  exit 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Doesn't allow the user to resize the frame
        frame.setResizable(false);
        //adds the game to the window 
        frame.add(game);
        //Allow the user to see the screen
        frame.setVisible(true);
        game.start();
    }
    
}
