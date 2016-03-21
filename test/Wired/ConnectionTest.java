/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wired;

import java.sql.SQLException;
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
public class ConnectionTest {
    
    public ConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Begin");
    }
    
    @After
    public void tearDown() {
                System.out.println("end");

    }

    @Test
    public void testSomeMethod() throws SQLException {
        Connection c = new Connection();
        assertEquals("Connected", c.s);
    }

    
}
