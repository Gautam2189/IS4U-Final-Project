/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


/**
 *
 * @author Ben
 */
public class Player extends JFrame {
    
    private int speedX, speedY;
    
    
    private Image playerStandSouth;
    private Image playerStandEast;
    private Image playerStandNorth;
    private Image playerStandWest;
           
    
    private void loadImages(){
        
        playerStandSouth = new ImageIcon("src//finalproject//playerStandSouth.png").getImage();
        playerStandEast = new ImageIcon("src//finalproject//playerStandEast.png").getImage();
        playerStandNorth = new ImageIcon("src//finalproject//playerStandNorth.png").getImage();
        playerStandWest = new ImageIcon("src//finalproject//playerStandWest.png").getImage();

    }
    


    
    private int playerX, playerY;
    
    public Player(int playerXinput, int playerYInput, int width, int height, int dx, int dy){
        
        playerX = playerXinput;
        playerY = playerYInput;
        
        loadImages();
        setBounds(playerX,playerY,width,height);
        this.speedX = dx;
        this.speedY = dy;
        

        
    }
    
    //Applies the speed to the players x and y coordinates.
    public void move(){
        
        if(playerX + speedX >= 0 && playerX + speedX <= 1046){
        this.playerX += speedX;
        
        } 
        
        if(playerY + speedY >= 0 && playerY + speedY <= 654){
        this.playerY += speedY;
        }
        
    }
    
    //Draws the player.
    public void draw(Graphics g){
        
        
        Graphics2D g2d = (Graphics2D)(g);
        
       
        
        g2d.drawImage(playerStandSouth,playerX,playerY,null);
        
    }
    
    //Sets the players speed on the x-axis to a new speed.
    public void setSpeedX(int newSpeedX){
        this.speedX = newSpeedX;
    }
    
    //Sets the players speed on the y-axis to a new speed.
    public void setSpeedY(int newSpeedY){
        this.speedY = newSpeedY;
    }
    
    //Returns the players speed in the y direction.
    public int getSpeedY(){
        
        return speedY;
    }
    
    //Returns the players speed in the x direction.
    public int getSpeedX(){
        
        return speedX;
    }
    
    //Returns the players current x positon.
    public int getXPos(){
        
        return playerX;
    }
    
    //Returns the players current y position.
    public int getYPos(){
        
        return playerY;
    }
    
    //Sets the players x coordinate to the inputted one.
    public void setXPos(int newXPos){
        
        playerX = newXPos;
    }
    
    //Sets the players y coordinate to the inputted one.
    public void setYPos(int newYPos){
        
        playerY = newYPos;
    }
    
    
}
