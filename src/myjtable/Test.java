/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Test {
    Connection con= null;

 public static void main(String[] args) {
      String url ="jdbc:sqlserver://localhost:3306;databaseName=testjava;integratedSecurity=true;"; 
try{
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con =DriverManager.getConnection(url);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(con!=null) {
        JOptionPane.showMessageDialog(null, "Your are connected");
        String query = "insert into login values('ahmad.kassem@hotmail.fr', 1234); " ;
        Statement st = null;
            try {
                st = con.createStatement();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Impossible to connect " + ex.toString()); 
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                st.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
}
}
     
     new Test();
    }

}
