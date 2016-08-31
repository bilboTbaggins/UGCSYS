/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
//import model.Staff;

/**
 * FXML Controller class
 *
 * @author Shesha and Steph
 */
public class LoginController implements Initializable {

    @FXML
    private Label lblMessage;

    @FXML
    private Label userNamelabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signInButton;

    @FXML
    private void signInButtonAction(ActionEvent event) throws IOException {

        String username = usernameTextField.getText();
        String password = passwordField.getText();

        if (user(username, password) != null) {
            {
                ((Node) (event.getSource())).getScene().getWindow().hide();
                Parent parent = FXMLLoader.load(LoginController.class.getClassLoader().getResource("view/Home.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(parent);
                stage.setScene(scene);
                stage.setTitle("Home");
                stage.show();
            }
        } else {
            lblMessage.setText("That email/password didn't work.\n"
                    + "Please try again.");
            
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
