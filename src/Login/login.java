/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Admin.Admin;
import AppPackage.AnimationClass;
import Boss.Boss;
import Subordoante.Sub;
import Wired.Connection;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Reda ben
 */
public class login extends javax.swing.JFrame {
     AnimationClass c;
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        Border blackline = BorderFactory.createLineBorder(Color.black);
        jLabel1.setBorder(blackline);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boss/closeB.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 16, 16));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/about.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -560, 800, 560));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(9, 9, 9));
        jTextField1.setText("Enter Your name");
        jTextField1.setBorder(null);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 297, 230, 40));

        jPasswordField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPasswordField1.setText("xcoder");
        jPasswordField1.setBorder(null);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 355, 230, 40));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/loginB.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 200, 60));

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 240, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Boss/min.png"))); // NOI18N
        jLabel9.setText("jLabel3");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 16, 16));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 16, 16));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 560));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 560));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 560));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/loginBH.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/loginB.png")));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/loginBP.png")));
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/loginBH.png")));
    }//GEN-LAST:event_jLabel2MouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        BufferedReader reader = null;
        try {
            File log = new File("login.conf");
            PrintWriter out = new PrintWriter(new FileWriter(log, true));
            reader = new BufferedReader(new FileReader("login.conf"));
            String line;
            int l=0,w=Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 400,h=Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 300;
            out.close();
            while ((line = reader.readLine()) != null)
            {
                if(l == 0 ) {
                    w = parseInt(line);
                    l++;
                }
                else  h = parseInt(line);
            }   reader.close();
            this.setLocation(w, h);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened
    int x, y;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        this.setLocation((int) evt.getXOnScreen() - x, (int) evt.getYOnScreen() - y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        login();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (jTextField1.getText().equalsIgnoreCase("enter your id")) {
            jTextField1.setText(null);
        }
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().isEmpty()) {
            jTextField1.setText("Enter your name");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        if (jTextField1.getText().equalsIgnoreCase("Enter your name")) {
            jTextField1.setText(null);
        }
        jLabel3.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        if (jPasswordField1.getText().equalsIgnoreCase("xcoder")) {
            jPasswordField1.setText(null);
        }
        jLabel3.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        if (jPasswordField1.getText().isEmpty()) {
            jPasswordField1.setText("xcoder");
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if (jTextField1.getText().equalsIgnoreCase("Enter your name")) {
            jTextField1.setText(null);
        }
        jLabel3.setText("");

    }//GEN-LAST:event_jTextField1FocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        if (jPasswordField1.getText().equalsIgnoreCase("xcoder")) {
            jPasswordField1.setText(null);
        }
        jLabel3.setText("");

    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(about){
            c = new AnimationClass();
            c.jLabelYUp(0, -560, 1, 4, jLabel7);
            jTextField1.enable();            
            jPasswordField1.enable();
            about = false;
        }else{
           if(new File("user.txt").delete() ) System.out.println("user.txt Deleted :D ");
           else System.out.println("user.txt Not deleted ");
           if(new File("login.conf").delete() ) System.out.println("login.conf Deleted :D ");
           else System.out.println("login.txt Not deleted ");
           if(new File("admin.conf").delete() ) System.out.println("admin.conf Deleted :D ");
           else System.out.println("admin.txt Not deleted ");
           if(new File("boss.conf").delete() ) System.out.println("boss.conf Deleted :D ");
           else System.out.println("boss.conf Not deleted ");
           if(new File("sub.conf").delete() ) System.out.println("sub.conf Deleted :D ");
           else System.out.println("sub.conf Not deleted ");
           if(new File("report.pdf").delete() ) System.out.println("report.pdf Deleted :D ");
           else System.out.println("report.pdf Not deleted ");
           if(new File("printreq.pdf").delete() ) System.out.println("printreq.pdf Deleted :D ");
           else System.out.println("printreq.pdf Not deleted ");
           System.exit(0);   
        }
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked
    boolean about = false;
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(!about){
            c = new AnimationClass();
            c.jLabelYDown(-560, 0, 1, 4, jLabel7);
            jTextField1.disable();            
            jPasswordField1.disable();
            about = true;
        }
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed
    private void login() {
        try {
            Connection connect = new Connection();
            Statement stmt = connect.con.createStatement();
            String SQL = "SELECT * FROM user where name ='" + jTextField1.getText() + "' and password = '" + jPasswordField1.getText() + "'";
            ResultSet results = stmt.executeQuery(SQL);
            FileWriter fw;
            PrintWriter pw;
            if (results.next()) {
                registerUser(results.getString("id_user"));
                if (results.getString("position").equals("boss")) {
                    fw = new FileWriter("boss.conf");
                    pw =new PrintWriter(fw);
                    pw.println(this.getLocationOnScreen().x);
                    pw.print(this.getLocationOnScreen().y);
                    pw.close();
                    new Boss().setVisible(true);
                } else if (results.getString("position").equals("sup")) {
                    fw = new FileWriter("admin.conf");
                    pw =new PrintWriter(fw);
                    pw.println(this.getLocationOnScreen().x);
                    pw.print(this.getLocationOnScreen().y);
                    pw.close();
                    new Admin().setVisible(true);
                } else {
                    fw = new FileWriter("sub.conf");
                    pw =new PrintWriter(fw);
                    pw.println(this.getLocationOnScreen().x);
                    pw.print(this.getLocationOnScreen().y);
                    pw.close();
                    new Sub().setVisible(true);
                }
                this.dispose();
            } else {
                jLabel3.setVisible(true);
                jLabel3.setText("Invalid Username or password");
            }
        } catch (SQLException ex) {
            jLabel3.setText("< Syntaxe Error >");
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void registerUser(String id) {
        try {
            FileWriter fw = new FileWriter("user.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print(id);
            pw.close();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}