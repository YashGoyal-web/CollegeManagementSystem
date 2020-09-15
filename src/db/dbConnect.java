package db;

import java.beans.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

public class dbConnect {

  public static Connection c;
  public static java.sql.Statement st;
  
  static{
             try{
                 c = DriverManager.getConnection("jdbc:mysql://localhost:3306/gnit"+"?allowPublicKeyRetrieval=true&useSSL=false","root","Yash@123");
             
                 st  = c.createStatement();
             }catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
             }
  }

}