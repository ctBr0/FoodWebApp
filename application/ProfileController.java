package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ProfileController {

    @FXML
    private Button homePage;

    @FXML
    private Button shoppingCart;

    @FXML
    private Button orderInformation;

    @FXML
    private Button logout;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private TextField userTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    void ChangeToHomePageScene(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("HomePage.fxml");
    }

    @FXML
    void ChangeToOIScene(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("OrderInformation.fxml");
    }

    @FXML
    void ChangeToShoppingCartScene(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("ShoppingCart.fxml");
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("LogOut.fxml");
    }

    @FXML
    void saveProfile(ActionEvent event) {
    	//need to save information to the database
    }

}
