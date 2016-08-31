/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Stephanie
 */
public class DatabaseConnection {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://104.199.187.239:3306/sample";

    static final String USER = "root";
    static final String PASSWORD = "google";
    
    Connection conn = null;
        Statement stmt = null;
        
        public void openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("connecting to a database");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

           
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

    }
    

