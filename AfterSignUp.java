package sample2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AfterSignUp {

    @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField password;

    @FXML
    private Button saveButton;

    @FXML
    private Label saveSuccessful;

    @FXML
    void clickSaveProfile(ActionEvent event) {
    	saveSuccessful.setText("Saved!");
	   }

}


