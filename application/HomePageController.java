package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HomePageController {
	
    @FXML
    private TableView<FoodItem> table;
    
	@FXML
    private TableColumn<FoodItem, String> foodName;

    @FXML
    private TableColumn<FoodItem, String> picture;

    @FXML
    private TableColumn<FoodItem, String> description;

    @FXML
    private TableColumn<FoodItem, Double> price;

    @FXML
    private TableColumn<FoodItem, Integer> numberoffood;
    ObservableList<FoodItem> list = FXCollections.observableArrayList(
    		new FoodItem("Chicken parm", 14.5, 30, "Main Course", {"Chicken", "Cheese"}),
    		new FoodItem("SUSUSU", "kskjjas", "delicious", 20, 3),
    		new FoodItem("SUSUSU", "kskjjas", "delicious", 20, 3),
    		new FoodItem("SUSUSU", "kskjjas", "delicious", 20, 3)
    		);
    public void initiallize(URL url, ResourceBundle rb) {
  	foodName.setCellValueFactory(null);
  	
    }  
    @FXML
    private TextField searchFood;

    @FXML
    private Button profile;

    @FXML
    private Button shoppingCart;

    @FXML
    private Button orderInformation;

    @FXML
    private Button logout;
    
    @FXML
    void logout(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("afterLogin.fxml");
    }
    
    @FXML
    void ChangeToProfileScene(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("profile.fxml");
    }

    @FXML
    void ChangeToOIScene(ActionEvent event) throws IOException{
    	Main m = new Main();
    	m.changeScene("OrderInformation.fxml");
    }

    @FXML
    void ChangeToShoppingCartScene(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("ShoppingCart.fxml");
    }

}