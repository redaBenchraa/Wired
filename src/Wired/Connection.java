/**
 *
 * @author Reda ben
 */
package Wired;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {

    public java.sql.Connection con;
    String s = "";
    public Connection() throws SQLException {

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            //con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3306/reqmanager","xcoders","xcoder");
            con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Wired", "root", "");
            if(con.isValid(10)) s = "Connected";
            else s="Not Connected";
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

