package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class OrderInformationController {

    @FXML
    private Button cash;

    @FXML
    private Label date;

    @FXML
    private Button echeck;

    @FXML
    private Label expectedTime;

    @FXML
    private Button homePage;

    @FXML
    private Button logout;

    @FXML
    private ListView<?> orderFoodList;

    @FXML
    private Label peopleAhead;

    @FXML
    private Button profile;

    @FXML
    private Button shoppingCart;

    @FXML
    private Label totalPrice;

    @FXML
    private Button visa;


    @FXML
    void ChangeToHomePageScene(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("HomePage.fxml");
    }

    @FXML
    void ChangeToProfileScene(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("profile.fxml");
    }

    @FXML
    void ChangeToShoppingCartScene(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("ShoppingCart.fxml");
    }

    @FXML
    void calculateDate(MouseEvent event) {
    	java.util.Date time = new java.util.Date();  
    	String now = time.toString();
    	date.setText(now);
    }

    @FXML
    void calculateExceptedTime(MouseEvent event) {
    	//need to get the order information how many food the customer ordered and the expected time is = # of food *5 minutes
    	int timeNeed = 0;
    	int order = 5;
    	timeNeed = 5*order;
    	String a = Integer.toString(timeNeed);
    	expectedTime.setText(a);
    }

    @FXML
    void calculatePeopleAhead(MouseEvent event) {
    	//need to the the people ahead of this customer
    	int people = 9;
    	String b = Integer.toString(people);
    	peopleAhead.setText(b);
    }

    @FXML
    void calculateTotalPrice(MouseEvent event) {
    	//total Price = sum of (item * number) need to get the number of items 
    	int price = 50;
    	String c = Integer.toString(price);
    	totalPrice.setText(c);
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
       	Main m = new Main();
    	m.changeScene("LogOut.fxml");
    }

}
