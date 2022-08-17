/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empolyee.payroll.managment.system;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
 
/**
 *
 * @author Rasana
 */
public class db {
    
      Connection conn = null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:MyDatabase.db");
            System.out.println("connection successfull");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println("connection Failed");
            return null;
            
            
        }
    
    }
}
