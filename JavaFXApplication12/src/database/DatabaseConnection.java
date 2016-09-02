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
import com.mysql.jdbc.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Stephanie
 */
public class DatabaseConnection {

    protected static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    protected static final String DB_URL = "jdbc:mysql://104.199.187.239:3306/sample";

    protected static final String USER = "root";
    protected static final String PASSWORD = "google";

    protected Connection conn = null;
    protected Statement stmt = null;

    protected void openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("connecting to a database");
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
