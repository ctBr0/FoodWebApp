package application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
public class LogInController {

    public LogInController() {

    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    
    @FXML
    private Button signupButton;

    @FXML
    void userSignup(ActionEvent event) throws IOException{
    	Main m = new Main();
    	m.changeScene("register.fxml");
    }


    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();

    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        //need to check if the username and the password is correct within the data base
        if(username.getText().toString().equals("javacoding") && password.getText().toString().equals("123")) {
            wrongLogIn.setText("Success!");
            m.changeScene("HomePage.fxml");
            //m.changeScene("afterLogin.fxml");
            //
        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Please enter your data.");
        }


        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }


}