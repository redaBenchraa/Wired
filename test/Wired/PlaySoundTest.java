/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wired;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reda ben
 */
public class PlaySoundTest {
    
    public PlaySoundTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of play method, of class PlaySound.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        PlaySound instance = new PlaySound(System.getProperty("user.dir")+"/src/Wired/sound.wav");
        instance.play();
        try {
            Thread.sleep(2200);
        } catch (InterruptedException ex) {
            Logger.getLogger(PlaySoundTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
