package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {


    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button register;

    @FXML
    private TextField email;

    @FXML
    private TextField phone;

    @FXML
    void register(ActionEvent event) throws IOException {
    	//store the information to database use text or my sql
    	//switch to menu tab
    	Main m = new Main();
    	m.changeScene("HomePage.fxml");

    }

}
