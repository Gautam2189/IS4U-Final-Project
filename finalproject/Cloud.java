
package finalproject;

public class Cloud implements Creatures{
    String name;
    int hp;
    int mp;
    int atk;
    int level;
    
    public Cloud(String nam){
        name = nam;
    }
    public void initializeCloud(Cloud a){
        
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
    
    public void attack(Monsters m){
        int enemyHealth = m.getHp();
        m.setHp(enemyHealth - atk);
    }
    public void specialAttack(Monsters m){
        int enemyHealth = m.getHp();
        if(mp > 5){
            m.setHp(enemyHealth - (atk + 10));
            mp -= 5;
        }
    }
}

