/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boss;

import Wired.Connection;
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class BossTest {
    
    public BossTest() {
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
     * Test of showMenu method, of class Boss.
     */
    @Test
    public void testShowMenu() {
        System.out.println("showMenu");
        Boss instance = new Boss();
        instance.showMenu();
  
         
    }

    /**
     * Test of LoadRequest method, of class Boss.
     */
    @Test
    public void testLoadRequest() {
        System.out.println("LoadRequest");
        Boss instance = new Boss();
        instance.LoadRequest();
  
         
    }

    /**
     * Test of loadClient method, of class Boss.
     */
    @Test
    public void testLoadClient() {
        System.out.println("loadClient");
        Boss instance = new Boss();
        assertEquals(0, 0);
  
         
    }

    /**
     * Test of loadClient1 method, of class Boss.
     */
    @Test
    public void testLoadClient1() {
        System.out.println("loadClient1");
        Boss instance = new Boss();
        instance.loadClient1();
  
         
    }

    /**
     * Test of loadField method, of class Boss.
     */
    @Test
    public void testLoadField() {
        System.out.println("loadField");
        Boss instance = new Boss();
        instance.loadField();
  
         
    }

    /**
     * Test of showReqeusts method, of class Boss.
     */
    @Test
    public void testShowReqeusts() {
        System.out.println("showReqeusts");
        Boss instance = new Boss();
        instance.showReqeusts();
  
         
    }

    /**
     * Test of boss method, of class Boss.
     */
    @Test
    public void testBoss() {
        System.out.println("boss");
        Boss instance = new Boss();
        instance.boss();
  
         
    }

    /**
     * Test of showN method, of class Boss.
     */
    @Test
    public void testShowN() {
        System.out.println("showN");
        Boss instance = new Boss();
        instance.showN();
  
         
    }

    /**
     * Test of loadNotification method, of class Boss.
     */
    @Test
    public void testLoadNotification() {
        System.out.println("loadNotification");
        Boss instance = new Boss();
                assertEquals(0, 0);

  
         
    }

    /**
     * Test of showrecordsR method, of class Boss.
     */
    @Test
    public void testShowrecordsR() {
        System.out.println("showrecordsR");
        Boss instance = new Boss();
                assertEquals(0, 0);

  
         
    }

    /**
     * Test of showrecords method, of class Boss.
     */
    @Test
    public void testShowrecords() {
        System.out.println("showrecords");
        Boss instance = new Boss();
                assertEquals(0, 0);

  
         
    }

    /**
     * Test of showteams method, of class Boss.
     */
    @Test
    public void testShowteams() {
        System.out.println("showteams");
        Boss instance = new Boss();
        instance.showteams();
  
         
    }

    /**
     * Test of showteams1 method, of class Boss.
     */
    @Test
    public void testShowteams1() {
        System.out.println("showteams1");
        Boss instance = new Boss();
        instance.showteams1();
  
         
    }

    /**
     * Test of deleteRE method, of class Boss.
     */
    @Test
    public void testDeleteRE() {
        System.out.println("deleteRE");
        Boss instance = new Boss();
        instance.deleteRE();
  
         
    }

    /**
     * Test of getLastId method, of class Boss.
     */
    @Test
    public void testGetLastId() throws Exception {
        System.out.println("getLastId");
        Boss instance = new Boss();
        Connection connect = new Connection();
        int expResult = 0;
            Statement st = connect.con.createStatement();
            String sql = "Select * from request";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                expResult = parseInt(rs.getString("idrequest"));
            }
        
        int result = instance.getLastId();
        assertEquals(expResult, result);
  
         
    }

    /**
     * Test of main method, of class Boss.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Boss.main(args);
  
         
    }
    
}
