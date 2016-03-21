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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getter method, of class Person.
     */
    @Test
    public void testGetter() {
        System.out.println("getter");
        String var = "name";
        Person instance = new Person(1,"reda","ben","IC","Boss","xcoder");
        String expResult = "reda";
        String result = instance.getter(var);
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Person.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Person instance = new Person(1,"reda","ben","IC","Boss","xcoder");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Person.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int idUser = 0;
        Person instance = new Person(1,"reda","ben","IC","Boss","xcoder");
        instance.setId(idUser);
        assertEquals(idUser, instance.getId());

    }

    /**
     * Test of setter method, of class Person.
     */
    @Test
    public void testSetter() {
        System.out.println("setter");
        String var = "password";
        String StringVal = "XCODER";
        Person instance = new Person(1,"reda","ben","IC","Boss","xcoder");
        instance.setter(StringVal, instance.getter(var));
        
    }
    
}
