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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private TableColumn<FoodItem, Button> numberoffood;
@FXML    
Button b1=new Button("Order");
private void pizzaorder(ActionEvent event) {
	int num=0;
	b1.setText("success"+num);
	num++;
}
Button b2=new Button("Order");
private void burgerorder(ActionEvent event) {
	b2.setText("success");
}
Button b3=new Button("Order");
private void xlborder(ActionEvent event) {
	b3.setText("success");
}
Button b4=new Button("Order");
private void noodleorder(ActionEvent event) {
	b4.setText("success");
}

    private final ObservableList<FoodItem> list = FXCollections.observableArrayList();
	
   @Override
    public void initialize(URL url, ResourceBundle rb) {

    	b1.setOnAction(this::pizzaorder);
    	b2.setOnAction(this::burgerorder);
    	b3.setOnAction(this::xlborder);
    	b4.setOnAction(this::noodleorder);
    	name.setCellValueFactory(new PropertyValueFactory<FoodItem,String>("name"));
    	picture.setPrefWidth(80);
    	picture.setCellValueFactory(new PropertyValueFactory<>("picture"));
    	
    	description.setCellValueFactory(new PropertyValueFactory<FoodItem,String>("description"));
    	price.setCellValueFactory(new PropertyValueFactory<FoodItem,Integer>("price"));
    	numberoffood.setCellValueFactory(new PropertyValueFactory<FoodItem,Button>("numberoffood")); 
    	
    	ImageView pizza = new ImageView(new Image(this.getClass().getResourceAsStream("pizza.png")));
    	FoodItem f1 =new FoodItem("pizza",pizza, "cheese,meat,veges", 9, b1);
    	list.add(f1);
    	ImageView burger = new ImageView(new Image(this.getClass().getResourceAsStream("burger.png")));
   	    ImageView xiaolongbao = new ImageView(new Image(this.getClass().getResourceAsStream("xiaolongbao.png")));
   	    ImageView noodle = new ImageView(new Image(this.getClass().getResourceAsStream("noodle.png")));
   	    FoodItem f2 =new FoodItem("buger",burger, "meat,bread,cheese,veges", 10, b2);
   	    FoodItem f3 =new FoodItem("xiaolongbao", xiaolongbao, "dough,meat", 10, b3);
   	    FoodItem f4 =new FoodItem("noodles", noodle, "dough", 11, b4);
   	    list.add(f2);
   	    list.add(f3);
   	    list.add(f4);
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
