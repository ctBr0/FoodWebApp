package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class HomePageController implements Initializable{
	
    @FXML
    private TableView<FoodItem> table;
    
	  @FXML
    private TableColumn<FoodItem, String> name;

    @FXML
    private TableColumn<FoodItem, String> picture;

    @FXML
    private TableColumn<FoodItem, String> description;

    @FXML
    private TableColumn<FoodItem, Integer> price;

    @FXML
    private TableColumn<FoodItem, Integer> numberoffood;
	ObservableList<FoodItem> list = FXCollections.observableArrayList(
	new FoodItem("pizze", "*", "cheese,meat,veges", 9, 0),
    new FoodItem("buger", "*", "meat,bread,cheese,veges", 10, 0),
	new FoodItem("xiaolongbao", "*", "dough,meat", 10, 0),
	new FoodItem("noodles", "*", "dough", 11, 0));
	
   @Override
    public void initialize(URL url, ResourceBundle rb) {

    	
    	name.setCellValueFactory(new PropertyValueFactory<FoodItem,String>("name"));
    	picture.setCellValueFactory(new PropertyValueFactory<FoodItem,String>("picture"));
    	description.setCellValueFactory(new PropertyValueFactory<FoodItem,String>("description"));
    	price.setCellValueFactory(new PropertyValueFactory<FoodItem,Integer>("price"));
    	numberoffood.setCellValueFactory(new PropertyValueFactory<FoodItem,Integer>("numberoffood"));	
    	table.setItems(list);
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
