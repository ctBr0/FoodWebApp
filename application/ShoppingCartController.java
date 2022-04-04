package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;



public class ShoppingCartController implements Initializable{

    @FXML
    private Button homePage;

    @FXML
    private Button logout;
 

    @FXML
    private Button orderInformation;

    @FXML
    private Button placeOrder;


    @FXML
    private Button profile;

    @FXML
    private Label totalPrice;

    //table
    @FXML
    private TableView<FoodItem> table;
    
    @FXML
    private TableColumn<FoodItem, String> name;

    @FXML
    private TableColumn<FoodItem, String> description;

    @FXML
    private TableColumn<FoodItem, Button> numberoffood;

    @FXML
    private TableColumn<FoodItem, Integer> price;

    @FXML
    void ChangeToHomePageScene(ActionEvent event) throws IOException{
        Main m = new Main();
    	m.changeScene("HomePage.fxml");
    }

    @FXML
    void ChangeToOIScene(ActionEvent event) throws IOException {
        Main m = new Main();
    	m.changeScene("OrderInformation.fxml");



    @FXML
    void ChangeToProfileScene(ActionEvent event) {

    }

    @FXML
    void clickPlaceOrder(ActionEvent event) throws IOException {
        Main m = new Main();
    	m.changeScene("OrderInformation.fxml");


    @FXML
    void logout(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("afterLogin.fxml");

    private final ObservableList<FoodItem> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // b1.setOnAction(this::pizzaorder);
    	// b2.setOnAction(this::burgerorder);
    	// b3.setOnAction(this::xlborder);
    	// b4.setOnAction(this::noodleorder);
    	name.setCellValueFactory(new PropertyValueFactory<FoodItem,String>("name"));
    	// picture.setPrefWidth(80);
    	// picture.setCellValueFactory(new PropertyValueFactory<>("picture"));
    	
    	description.setCellValueFactory(new PropertyValueFactory<FoodItem,String>("description"));
    	price.setCellValueFactory(new PropertyValueFactory<FoodItem,Integer>("price"));
    	numberoffood.setCellValueFactory(new PropertyValueFactory<FoodItem,Button>("numberoffood")); 
    	
    	ImageView pizza = new ImageView(new Image(this.getClass().getResourceAsStream("pizza.png")));
    	FoodItem f1 =new FoodItem("pizza",pizza, "cheese,meat,veges", 9);
    	list.add(f1);
    	ImageView burger = new ImageView(new Image(this.getClass().getResourceAsStream("burger.png")));
   	    ImageView xiaolongbao = new ImageView(new Image(this.getClass().getResourceAsStream("xiaolongbao.png")));
   	    ImageView noodle = new ImageView(new Image(this.getClass().getResourceAsStream("noodle.png")));
   	    FoodItem f2 =new FoodItem("buger",burger, "meat,bread,cheese,veges", 10);
   	    FoodItem f3 =new FoodItem("xiaolongbao", xiaolongbao, "dough,meat", 10);
   	    FoodItem f4 =new FoodItem("noodles", noodle, "dough", 11);
        list.add(f2);
   	    list.add(f3);
   	    list.add(f4);
        table.setItems(list);


    }

}
