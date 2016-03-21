/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wired;

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
public class TeamTest {
    
    public TeamTest() {
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
     * Test of getter method, of class Team.
     */
    @Test
    public void testGetter() {
        System.out.println("getter");
        String var = "";
        Team instance = new Team(1,1);
        int expResult = 1;
        int result = instance.getter(var);
        assertEquals(expResult, result);
    }

    /**
     * Test of setter method, of class Team.
     */
    @Test
    public void testSetter() {
        System.out.println("setter");
        String var = "idTeam";
        int val = 0;
        Team instance = new Team(1,1);
        instance.setter(var, val);
        int expResult = 0;
        int result = instance.getter(var);
        assertEquals(expResult, result);
        
    }
    
}
