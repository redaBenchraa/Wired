/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wired;

import java.util.Date;
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
public class RequestTest {
    public RequestTest() {
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
     * Test of stringGetter method, of class Request.
     */
    @Test
    public void testStringGetter() {
        System.out.println("stringGetter");
        String var = "clientTel";
        Request instance = new Request(1,"Reda","Azilal","","0623224424",false,false,false,new Date("1994/01/01"),new Date("1994/01/01"),new Date("1994/01/01"),"ADSL","Installation",1,1,"");
        String expResult = "Reda";
        String result = instance.stringGetter(var);
        assertEquals(expResult, result);
    }

    /**
     * Test of intGetter method, of class Request.
     */
    @Test
    public void testIntGetter() {
        System.out.println("intGetter");
        String var = "idRequest";
        Request instance = new Request(1,"Reda","Azilal","","0623224424",false,false,false,new Date("1994/01/01"),new Date("1994/01/01"),new Date("1994/01/01"),"ADSL","Installation",1,1,"");
        int expResult = 1;
        int result = instance.intGetter(var);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of boolGetter method, of class Request.
     */
    @Test
    public void testBoolGetter() {
        System.out.println("boolGetter");
        String var = "seen";
        Request instance = new Request(1,"Reda","Azilal","","0623224424",false,false,false,new Date("1994/01/01"),new Date("1994/01/01"),new Date("1994/01/01"),"ADSL","Installation",1,1,"");
        boolean expResult = false;
        boolean result = instance.boolGetter(var);
        assertEquals(expResult, result);
    }

    /**
     * Test of dateGetter method, of class Request.
     */
    @Test
    public void testDateGetter() {
        System.out.println("dateGetter");
        String var = "seen";
        Request instance = new Request(1,"Reda","Azilal","","0623224424",false,false,false,new Date("1994/01/01"),new Date("1994/01/01"),new Date("1994/01/01"),"ADSL","Installation",1,1,"");
        Date expResult = new Date("1994/01/01");
        Date result = instance.dateGetter(var);
        assertEquals(expResult, result);
    }

    /**
     * Test of setter method, of class Request.
     */
    @Test
    public void testSetter_String_String() {
        System.out.println("setter");
        String var = "clientTel";
        String stringVal = "Reda";
        Request instance = new Request(1,"Reda","Azilal","","0623224424",false,false,false,new Date("1994/01/01"),new Date("1994/01/01"),new Date("1994/01/01"),"ADSL","Installation",1,1,"");
        instance.setter(var, stringVal);
        String result = instance.stringGetter(var);
        assertEquals(stringVal, result);
    }

    /**
     * Test of setter method, of class Request.
     */
    @Test
    public void testSetter_String_int() {
        System.out.println("setter");
        String var = "idRequest";
        int intVal = 0;
        Request instance = new Request(1,"Reda","Azilal","","0623224424",false,false,false,new Date("1994/01/01"),new Date("1994/01/01"),new Date("1994/01/01"),"ADSL","Installation",1,1,"");
        instance.setter(var, intVal);
        int result = instance.intGetter(var);
        assertEquals(result, intVal);
    }

    /**
     * Test of setter method, of class Request.
     */
    @Test
    public void testSetter_String_boolean() {
        System.out.println("setter");
        String var = "seen";
        boolean boolval = true;
        Request instance = new Request(1,"Reda","Azilal","","0623224424",false,false,false,new Date("1994/01/01"),new Date("1994/01/01"),new Date("1994/01/01"),"ADSL","Installation",1,1,"");
        instance.setter(var, boolval);
        boolean result = instance.boolGetter(var);
        assertEquals(result, boolval);
    }

    /**
     * Test of setter method, of class Request.
     */
    @Test
    public void testSetter_String_Date() {
        System.out.println("setter");
        String var = "seenDate";
        Date dateVal = new Date("1994/01/02");
        Request instance = new Request(1,"Reda","Azilal","","0623224424",false,false,false,new Date("1994/01/01"),new Date("1994/01/01"),new Date("1994/01/01"),"ADSL","Installation",1,1,"");
        instance.setter(var, dateVal);
        Date result = instance.dateGetter("seen");
        assertEquals(result, dateVal);
    }
    
}
