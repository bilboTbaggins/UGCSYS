  /* To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */
 package src;
 
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
 import javafx.application.Application;
 import javafx.fxml.FXMLLoader;
 import javafx.scene.Parent;
 import javafx.scene.Scene;
 import javafx.stage.Stage;
 
 import database.DatabaseConnection;
 
 /**
  *
  * @author Stephanie
  * 
  * I made this to start something that looks like a MVC program. The database classes will all be stored in the Database package.
  * 
  * The MySQL JDBC driver is setup in the crosspath of this project.
  * 
  * The main method creates an instance of a Database Connection and then calls the method that I created as an example just to see
  * if the JDBC was functioning. The method returns a result set from the user table successfully. This method has no place in the final program 
  * and is only for testing purposes.
  */
 public class Main extends Application {
 
     @Override
     public void start(Stage stage) throws Exception {
         Parent root = FXMLLoader.load(getClass().getResource("view/Login.fxml"));
 
         Scene scene = new Scene(root);
 
         stage.setScene(scene);
         stage.show();
     }
 
     /**
      * @param args the command line arguments
      */
     
 
     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
         DatabaseConnection databaseConnection = new DatabaseConnection();
         
         databaseConnection.openConnection();
        
 
     }
 }
 