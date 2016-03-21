package Wired;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class PlaySound{
    Clip clip;
    AudioInputStream audioIn;
  public PlaySound(String args){
        try {
            clip = AudioSystem.getClip();
            audioIn = AudioSystem.getAudioInputStream(new File(args));
            clip.open(audioIn);
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException ex) {
            Logger.getLogger(PlaySound.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  public void play(){
    clip.stop();
    clip.setFramePosition(0);
    clip.start(); 
  }
}