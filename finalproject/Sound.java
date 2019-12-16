package finalproject;

import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Sound {
    public Sound(){
        
    }

    public static void playMusic(String filePath, boolean play){
        try{
            File musicPath = new File(filePath);
            
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                if(play == false){
                    clip.stop();
                }
                
                
            }else{
                System.out.println("Cant find file...");
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void stop(){
    }
}
