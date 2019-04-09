
package main;

import javax.swing.*;
import java.sql.*;
/**
 *
 * @author mahad
 */
public class Connector {
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?useSSL=false", "root", "");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
