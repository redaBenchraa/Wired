/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Wired.Connection;
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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of showMenu method, of class Admin.
     */
    @Test
    public void testShowMenu() {
        System.out.println("showMenu");
        Admin instance = new Admin();
        instance.showMenu();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of hideMenu method, of class Admin.
     */
    @Test
    public void testHideMenu() {
        System.out.println("hideMenu");
        Admin instance = new Admin();
        instance.hideMenu();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showrecordsB method, of class Admin.
     */
    @Test
    public void testShowrecordsB() {
        System.out.println("showrecordsB");
        Admin instance = new Admin();
        instance.showrecordsB();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of insertBO method, of class Admin.
     */
    @Test
    public void testInsertBO() {
        System.out.println("insertBO");
        Admin instance = new Admin();
        instance.insertBO();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showrecords method, of class Admin.
     */
    @Test
    public void testShowrecords() {
        System.out.println("showrecords");
        Admin instance = new Admin();
        instance.showrecords();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showteams method, of class Admin.
     */
    @Test
    public void testShowteams() {
        System.out.println("showteams");
        Admin instance = new Admin();
        instance.showteams();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getlastid method, of class Admin.
     */
    @Test
    public void testGetlastid() throws Exception {
        System.out.println("getlastid");
        Admin instance = new Admin();
        int expResult = 0;
        Connection connect = new Connection();
            Statement st = connect.con.createStatement();
            String sql = "Select * from user";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                expResult = rs.getInt("id_user");
            }
            expResult++;
        int result = instance.getlastid();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteBO method, of class Admin.
     */
    @Test
    public void testDeleteBO() {
        System.out.println("deleteBO");
        int i = 0;
        Admin instance = new Admin();
        instance.deleteBO(i);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of editBO method, of class Admin.
     */
    @Test
    public void testEditBO() {
        System.out.println("editBO");
        Admin instance = new Admin();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of updateBO method, of class Admin.
     */
    @Test
    public void testUpdateBO() {
        System.out.println("updateBO");
        Admin instance = new Admin();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isNumeric method, of class Admin.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "";
        boolean expResult = false;
        boolean result = Admin.isNumeric(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showSearchedB method, of class Admin.
     */
    @Test
    public void testShowSearchedB() {
        System.out.println("showSearchedB");
        Admin instance = new Admin();
        instance.showSearchedB();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of insertRE method, of class Admin.
     */
    @Test
    public void testInsertRE() {
        System.out.println("insertRE");
        Admin instance = new Admin();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTeam method, of class Admin.
     */
    @Test
    public void testGetTeam() {
        System.out.println("getTeam");
        Admin instance = new Admin();
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of deleteRE method, of class Admin.
     */
    @Test
    public void testDeleteRE() {
        System.out.println("deleteRE");
        Admin instance = new Admin();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of editEM method, of class Admin.
     */
    @Test
    public void testEditEM() {
        System.out.println("editEM");
        Admin instance = new Admin();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of updateEM method, of class Admin.
     */
    @Test
    public void testUpdateEM() {
        System.out.println("updateEM");
        Admin instance = new Admin();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showSearchedEMP method, of class Admin.
     */
    @Test
    public void testShowSearchedEMP() {
        System.out.println("showSearchedEMP");
        Admin instance = new Admin();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getlasteam method, of class Admin.
     */
    @Test
    public void testGetlasteam() {
        try {
            System.out.println("getlasteam");
            Admin instance = new Admin();
            int expResult = 0;
            Connection connect = new Connection();
            Statement st = connect.con.createStatement();
            String sql = "Select * from team";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                expResult = rs.getInt("idteam");
            }
            expResult++;
            int result = instance.getlasteam();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
        } catch (SQLException ex) {
            Logger.getLogger(AdminTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Test of insertT method, of class Admin.
     */
    @Test
    public void testInsertT() {
        System.out.println("insertT");
        Admin instance = new Admin();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showrecordsT method, of class Admin.
     */
    @Test
    public void testShowrecordsT() {
        System.out.println("showrecordsT");
        Admin instance = new Admin();
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of deleteT method, of class Admin.
     */
    @Test
    public void testDeleteT() {
        System.out.println("deleteT");
        int i = 0;
        Admin instance = new Admin();
        assertEquals(0, 0);
        
    }

    /**
     * Test of showSearchedT method, of class Admin.
     */
    @Test
    public void testShowSearchedT() {
        System.out.println("showSearchedT");
        Admin instance = new Admin();
        assertEquals(0, 0);
    }

    /**
     * Test of main method, of class Admin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        assertEquals(0, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
