/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wired;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Walid
 */
public class insertinbd {
boolean rqclient;
    public insertinbd() throws SQLException{
        
    }


 public  int insertbd() throws SQLException{
         Connection connect;
      connect = new Connection();
      Statement stmt  = connect.con.createStatement();          
String client = "INSERT INTO client(Fullname,phone,address,password,service) values('dd',reda','0677228512','eee','eee','phone line')";
  return stmt.executeUpdate(client);
   
 }
    public static void main(String args[]) {
        try {
            insertinbd in = new insertinbd();
           
               System.out.println("success "+in.insertbd());
            
        } catch (SQLException ex) {
            Logger.getLogger(insertinbd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
