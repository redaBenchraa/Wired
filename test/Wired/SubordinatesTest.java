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
public class SubordinatesTest {
    
    public SubordinatesTest() {
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
     * Test of intGetter method, of class Subordinates.
     */
    @Test
    public void testIntGetter() {
        System.out.println("intGetter");
        String var = "idTeam";
        Subordinates instance = new Subordinates(1,2,"reda","ben","IC","Boss","xcoder");;
        int expResult = 2;
        int result = instance.intGetter(var);
        assertEquals(expResult, result);
    }

    /**
     * Test of setter method, of class Subordinates.
     */
    @Test
    public void testSetter() {
        System.out.println("setter");
        String var = "idTeam";
        int intVal = 3;
        Subordinates instance = new Subordinates(1,2,"reda","ben","IC","Boss","xcoder");;
        instance.setter(var, intVal);
        int result = instance.intGetter(var);
        assertEquals(intVal, result);
    }

    /**
     * Test of sendReport method, of class Subordinates.
     */
    @Test
    public void testSendReport() {
        System.out.println("sendReport");
        Subordinates instance = new Subordinates(1,2,"reda","ben","IC","Boss","xcoder");;
        instance.sendReport();
        
    }

    /**
     * Test of getRequestsList method, of class Subordinates.
     */
    @Test
    public void testGetRequestsList() {
        System.out.println("getRequestsList");
        Subordinates instance = new Subordinates(1,2,"reda","ben","IC","Boss","xcoder");;
        instance.getRequestsList();
    }
    
}
