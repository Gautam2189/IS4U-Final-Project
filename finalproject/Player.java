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

    private int playerX, playerY;

    public Player(int playerXinput, int playerYInput, int width, int height, int dx, int dy) {

        playerX = playerXinput;
        playerY = playerYInput;

        setBounds(playerX, playerY, width, height);
        
        this.speedX = dx;
        this.speedY = dy;

        loadImages();

        setPlayerImage(playerStandSouth);

    }

    private Image playerStandSouth;
    private Image playerStandEast;
    private Image playerStandNorth;
    private Image playerStandWest;
    private Image playerWalkEastBackLeg;
    private Image playerWalkEastFrontLeg;
    private Image playerWalkWestBackLeg;
    private Image playerWalkWestFrontLeg;
    private Image playerWalkNorthLeftLeg;
    private Image playerWalkNorthRightLeg;
    private Image playerWalkSouthLeftLeg;
    private Image playerWalkSouthRightLeg;

    public String direction = "none";

    private void loadImages() {

        playerStandSouth = new ImageIcon("src//finalproject//playerStandSouth.png").getImage();
        playerStandEast = new ImageIcon("src//finalproject//playerStandEast.png").getImage();
        playerStandNorth = new ImageIcon("src//finalproject//playerStandNorth.png").getImage();
        playerStandWest = new ImageIcon("src//finalproject//playerStandWest.png").getImage();
        playerWalkEastBackLeg = new ImageIcon("src//finalproject//playerWalkEastBackLeg.png").getImage();
        playerWalkEastFrontLeg = new ImageIcon("src//finalproject//playerWalkEastFrontLeg.png").getImage();
        playerWalkWestBackLeg = new ImageIcon("src//finalproject//playerWalkWestBackLeg.png").getImage();
        playerWalkWestFrontLeg = new ImageIcon("src//finalproject//playerWalkWestFrontLeg.png").getImage();
        playerWalkNorthLeftLeg = new ImageIcon("src//finalproject//playerWalkNorthLeftLeg.png").getImage();
        playerWalkNorthRightLeg = new ImageIcon("src//finalproject//playerWalkNorthRightLeg.png").getImage();
        playerWalkSouthLeftLeg = new ImageIcon("src//finalproject//playerWalkSouthLeftLeg.png").getImage();
        playerWalkSouthRightLeg = new ImageIcon("src//finalproject//playerWalkSouthRightLeg.png").getImage();

    }

    public void setStanding(String currentDirection) {

        if (currentDirection.equals("left")) {
            
            setPlayerImage(playerStandWest);

        } else if (currentDirection.equals("right")) {
            
            setPlayerImage(playerStandEast);


        } else if (currentDirection.equals("up")) {
            
            setPlayerImage(playerStandNorth);


        } else {
            
            setPlayerImage(playerStandSouth);


        }

    }

    public void setDirection(String newDirection) {

        startWalkTime = System.currentTimeMillis();

        walkTime = System.currentTimeMillis() - startWalkTime;

        direction = newDirection;

        if (direction.equals("left")) {

            setSpeedX(-2);
            setSpeedY(0);

        } else if (direction.equals("right")) {

            setSpeedX(2);
            setSpeedY(0);

        } else if (direction.equals("up")) {

            setSpeedY(-2);
            setSpeedX(0);

        } else if (direction.equals("down")) {

            setSpeedY(2);
            setSpeedX(0);
        } else {

            setSpeedY(0);
            setSpeedX(0);

        }
    }

    public long walkTime;
    public long startWalkTime;

    public String getDirection() {

        return direction;
    }

    //Applies the speed to the players x and y coordinates.
    public void move() {

        if (playerX + speedX >= 0 && playerX + speedX <= 1046) {
            this.playerX += speedX;

        }

        if (playerY + speedY >= 0 && playerY + speedY <= 654) {
            this.playerY += speedY;
        }

    }

    public int moveTime = 0;

    public void walkAnimation() {

        if (direction.equals("down")) {

            if (moveTime < 10) {
                playerImage = playerStandSouth;

            } else if (moveTime >= 10 && moveTime < 20) {

                playerImage = playerWalkSouthLeftLeg;
            } else if (moveTime >= 20 && moveTime < 30) {

                playerImage = playerStandSouth;
            } else if (moveTime >= 30 && moveTime < 40) {

                playerImage = playerWalkSouthRightLeg;

            } else if (moveTime > 40) {

                playerImage = playerStandSouth;
                moveTime = 0;

            }
            moveTime++;
        } else if (direction.equals("up")) {

            if (moveTime < 10) {
                playerImage = playerStandNorth;

            } else if (moveTime >= 10 && moveTime < 20) {

                playerImage = playerWalkNorthLeftLeg;
            } else if (moveTime >= 20 && moveTime < 30) {

                playerImage = playerStandNorth;
            } else if (moveTime >= 30 && moveTime < 40) {

                playerImage = playerWalkNorthRightLeg;

            } else if (moveTime > 40) {

                playerImage = playerStandNorth;
                moveTime = 0;

            }
            moveTime++;
        } else if (direction.equals("right")) {

            if (moveTime < 10) {
                playerImage = playerStandEast;

            } else if (moveTime >= 10 && moveTime < 20) {

                playerImage = playerWalkEastFrontLeg;
            } else if (moveTime >= 20 && moveTime < 30) {

                playerImage = playerStandEast;
            } else if (moveTime >= 30 && moveTime < 40) {

                playerImage = playerWalkEastBackLeg;

            } else if (moveTime > 40) {

                playerImage = playerStandEast;
                moveTime = 0;

            }
            moveTime++;
        } else if (direction.equals("left")) {

            if (moveTime < 10) {
                playerImage = playerStandWest;

            } else if (moveTime >= 10 && moveTime < 20) {

                playerImage = playerWalkWestFrontLeg;
            } else if (moveTime >= 20 && moveTime < 30) {

                playerImage = playerStandWest;
            } else if (moveTime >= 30 && moveTime < 40) {

                playerImage = playerWalkWestBackLeg;

            } else if (moveTime > 40) {

                playerImage = playerStandWest;
                moveTime = 0;

            }
            moveTime++;
        }

    }
    //Draws the player.

    public void draw(Graphics g) {

        Graphics2D g2d = (Graphics2D) (g);

        walkAnimation();

        g2d.drawImage(playerImage, playerX, playerY, null);

    }

    public Image playerImage;

    public void setPlayerImage(Image newPlayerImage) {

        playerImage = newPlayerImage;
    }

    //Sets the players speed on the x-axis to a new speed.
    public void setSpeedX(int newSpeedX) {
        this.speedX = newSpeedX;
    }

    //Sets the players speed on the y-axis to a new speed.
    public void setSpeedY(int newSpeedY) {
        this.speedY = newSpeedY;
    }

    //Returns the players speed in the y direction.
    public int getSpeedY() {

        return speedY;
    }

    //Returns the players speed in the x direction.
    public int getSpeedX() {

        return speedX;
    }

    //Returns the players current x positon.
    public int getXPos() {

        return playerX;
    }

    //Returns the players current y position.
    public int getYPos() {

        return playerY;
    }

    //Sets the players x coordinate to the inputted one.
    public void setXPos(int newXPos) {

        playerX = newXPos;
    }

    //Sets the players y coordinate to the inputted one.
    public void setYPos(int newYPos) {

        playerY = newYPos;
    }

}