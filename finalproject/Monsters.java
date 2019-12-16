
package finalproject;

abstract public class Monsters implements Creatures{
    String name;
    int hp;
    int mp;
    int atk;
    int level;
    public Monsters(){
        
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
    public int getAtk(){
        return atk;
    }
    public void setAtk(int attack){
        atk = attack;
    }
    public int getLevel(){
        return level;
    }
    


}
