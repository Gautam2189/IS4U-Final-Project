
package finalproject;

public class Goblin extends Monsters{
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
    /*
    public void attack(Char a){
        int playerHp = (Char)a.getHealth;
        a.setHealth(playerHp - atk);
    }
}*/
}
