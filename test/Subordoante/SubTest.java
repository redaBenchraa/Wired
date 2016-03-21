/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subordoante;

import Wired.Connection;
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class SubTest {
    
    public SubTest() {
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
     * Test of request method, of class Sub.
     */
    @Test
    public void testRequest() {
        System.out.println("request");
        Sub instance = new Sub();
        instance.request();
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of loadNotification method, of class Sub.
     */
    @Test
    public void testLoadNotification() {
        System.out.println("loadNotification");
        Sub instance = new Sub();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of openPDF method, of class Sub.
     */
    @Test
    public void testOpenPDF() {
        System.out.println("openPDF");
        Sub instance = new Sub();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of subordonate method, of class Sub.
     */
    @Test
    public void testSubordonate() {
        System.out.println("subordonate");
        Sub instance = new Sub();
        instance.subordonate();
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of showrecords method, of class Sub.
     */
    @Test
    public void testShowrecords() {
        System.out.println("showrecords");
        Sub instance = new Sub();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of showrecordsR method, of class Sub.
     */
    @Test
    public void testShowrecordsR() {
        System.out.println("showrecordsR");
        Sub instance = new Sub();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of SetSeen method, of class Sub.
     */
    @Test
    public void testSetSeen() {
        System.out.println("SetSeen");
        Sub instance = new Sub();
        instance.SetSeen();
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of setreq method, of class Sub.
     */
    @Test
    public void testSetreq() {
        System.out.println("setreq");
        Sub instance = new Sub();
        instance.setreq();
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of getLastReport method, of class Sub.
     */
    @Test
    public void testGetLastReport() {
        try {
            System.out.println("getLastReport");
            Sub instance = new Sub();
            int expResult = 0;
            Connection connect = new Connection();
            Statement st = connect.con.createStatement();
            String sql = "Select * from report";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                expResult = parseInt(rs.getString("idreport"));
            }
            expResult++;
            int result = instance.getLastReport();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
               
        } catch (SQLException ex) {
            Logger.getLogger(SubTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of sendReport method, of class Sub.
     */
    @Test
    public void testSendReport() {
        System.out.println("sendReport");
        Sub instance = new Sub();
        instance.sendReport();
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of setWindows method, of class Sub.
     */
    @Test
    public void testSetWindows() {
        System.out.println("setWindows");
        Sub instance = new Sub();
        instance.setWindows();
        // TODO review the generated test code and remove the default call to fail.
           
    }

    /**
     * Test of main method, of class Sub.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Sub.main(args);
        // TODO review the generated test code and remove the default call to fail.
           
    }
    
}
