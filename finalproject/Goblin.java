
package finalproject;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Goblin extends Monsters{
    
    Image goblinPic = new ImageIcon("src\\finalproject\\Goblin.gif").getImage();
    
    public Goblin(){

    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int health){
        hp = health;
    }
    
    public int getMp(){
        return mp;
    }
    public void setMp(int magic){
        mp = magic;
    }
    
    public int getAtk(){
        return atk;
    }
    public void setAtk(int attack){
        atk = attack;
    }
    
    public int getLevel(){
        return level;
    }
    public void setLevel(int lvl){
        level = lvl;
    }
    
    public void attack(Cloud a){
        int playerHp = Integer.valueOf(((Cloud)a).getHp());
        a.setHp(playerHp - atk);
    }

    public void specialAttack(Cloud a) {
        int rNum = (int)(Math.random() * 15) + 10;
        int health = a.getHp();
        a.setHp(health - rNum);
    }

}
