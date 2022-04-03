package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ShoppingCartController {

    @FXML
    private Button placeOrder;

    @FXML
    private Button homePage;

    @FXML
    private Button profile;

    @FXML
    private Button orderInformation;

    @FXML
    private Button logout;

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
    void ChangeToProfileScene(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("profile.fxml");
    }

    @FXML
    void calculateTotalPrice(MouseEvent event) {
    	//need to calculate the total price 
    	
    }
    
    @FXML
    void clickPlaceOrder(ActionEvent event) throws IOException {
    	//this part need to store the order information and calculate the total price
    	Main m = new Main();
    	m.changeScene("orderInformation.fxml");
    	
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("profile.fxml");
    }

}