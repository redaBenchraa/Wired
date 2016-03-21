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
public class bossTest {
    
    public bossTest() {
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
     * Test of sendRequest method, of class boss.
     */
    @Test
    public void testSendRequest() {
        System.out.println("sendRequest");
        boss instance = new boss(1,"reda","ben","IC","Boss","xcoder");
        instance.sendRequest();
    }

    /**
     * Test of getAllSentrequests method, of class boss.
     */
    @Test
    public void testGetAllSentrequests() {
        System.out.println("getAllSentrequests");
        boss instance = new boss(1,"reda","ben","IC","Boss","xcoder");
        instance.getAllSentrequests();
    }

    /**
     * Test of getReports method, of class boss.
     */
    @Test
    public void testGetReports() {
        System.out.println("getReports");
        boss instance = new boss(1,"reda","ben","IC","Boss","xcoder");
        instance.getReports();
    }
    
}
