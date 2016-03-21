/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wired;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
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
public class ReportTest {
    
    public ReportTest() {
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
     * Test of setter method, of class Report.
     */
    @Test
    public void testSetter_String_int() {
        System.out.println("setter");
        String var = "reportId";
        int intVal = 0;
        Report instance = new Report(1,new Date(1994-01-01),"Kolchi nadi",1,false,true,new Request());
        instance.setter(var, intVal);
        assertEquals(instance.intGetter(var), intVal);
    }

    /**
     * Test of setter method, of class Report.
     */
    @Test
    public void testSetter_String_Date() {
        System.out.println("setter");
        String var = "reportDate";
        Date dateVal = new Date(1994-01-02);
        Report instance = new Report(1,new Date(1994-01-01),"Kolchi nadi",1,false,true,new Request());
        instance.setter(var, dateVal);
        assertEquals(instance.dateGetter(var), dateVal);
    }

    /**
     * Test of setter method, of class Report.
     */
    @Test
    public void testSetter_String_String() {
        System.out.println("setter");
        String var = "description";
        String stringVal = "Nadi !";
        Report instance = new Report(1,new Date(1994-01-01),"Kolchi nadi",1,false,true,new Request());
        instance.setter(var, "Nadi !");
        assertEquals(instance.stringGetter(var), stringVal);
    }

    /**
     * Test of setter method, of class Report.
     */
    @Test
    public void testSetter_String_boolean() {
        System.out.println("setter");
        String var = "error";
        boolean boolVal = true;
        Report instance = new Report(1,new Date(1994-01-01),"Kolchi nadi",1,false,true,new Request());
        instance.setter(var, true);
        assertEquals(instance.boolGetter(var), boolVal);
    }

    /**
     * Test of intGetter method, of class Report.
     */
    @Test
    public void testIntGetter() {
        System.out.println("intGetter");
        String var = "reportId";
        Report instance = new Report(1,new Date(1994-01-01),"Kolchi nadi",1,false,true,new Request());
        int expResult = 1;
        int result = instance.intGetter(var);
        assertEquals(expResult, result);
    }

    /**
     * Test of boolGetter method, of class Report.
     */
    @Test
    public void testBoolGetter() {
        System.out.println("boolGetter");
        String var = "error";
        Report instance = new Report(1,new Date(1994-01-01),"Kolchi nadi",1,false,true,new Request());
        boolean expResult = false;
        boolean result = instance.boolGetter(var);
        assertEquals(expResult, result);
    }

    /**
     * Test of stringGetter method, of class Report.
     */
    @Test
    public void testStringGetter() {
        System.out.println("stringGetter");
        String var = "description";
        Report instance = new Report(1,new Date(1994-01-01),"Kolchi nadi",1,false,true,new Request());
        String expResult = "Kolchi nadi";
        String result = instance.stringGetter(var);
        assertEquals(expResult, result);
    }

    /**
     * Test of dateGetter method, of class Report.
     */
    @Test
    public void testDateGetter() {
        System.out.println("dateGetter");
        String var = "reportDate";
        Report instance = new Report(1,new Date("1994/01/01"),"Kolchi nadi",1,false,true,new Request());
        Date expResult = new Date("1994/01/01");
        Date result = instance.dateGetter(var);
        assertEquals(expResult, result);
    }   
}
