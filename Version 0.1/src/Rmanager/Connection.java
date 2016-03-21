package Rmanager;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Reda ben
 */
public class Connection {
    public java.sql.Connection con;
    public Connection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        //con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://db4free.net:3306/reqmanager","xcoders","xcoder");
        con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/rmanager","root","");

    }
}
