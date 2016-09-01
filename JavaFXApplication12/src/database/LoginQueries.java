/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Pudji
 */
public class LoginQueries extends DatabaseConnection {
    
    //method that retrieves the username and password from the database to be used
    //for authentication
    public boolean checkPassword (String zID, String password) {
        LoginQueries loginQueries = new LoginQueries();
        
        ResultSet rs;
        openConnection();
       
        
        
        if (conn != null) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("SELECT user_password FROM user WHERE user_z = ?");
                
                stmt.setString(1, zID);
                rs = stmt.executeQuery();
                while (rs.next()) {
                    String resultPassword = rs.getString(1);
                    boolean retVal = password.equals(resultPassword);
                    if (retVal == true) {
                        return true;
                    }  
                }
           
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            } 
        }
        return false;
    }
}
