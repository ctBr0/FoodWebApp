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
    private TableView<Food> table;
    
    @FXML
    private TableColumn<Food, String> name;

    @FXML
    private TableColumn<Food, String> description;

    @FXML
    private TableColumn<Food, Double> price;
    @FXML
    private TableColumn<Food, Integer> numberoffood;

    @FXML
    void ChangeToHomePageScene(ActionEvent event) throws IOException{
        Main m = new Main();
    	m.changeScene("HomePage.fxml");
    }

    @FXML
    void ChangeToOIScene(ActionEvent event) throws IOException {
        Main m = new Main();
    	m.changeScene("OrderInformation.fxml");}



    @FXML
    void ChangeToProfileScene(ActionEvent event) {

    }

    @FXML
    void clickPlaceOrder(ActionEvent event) throws IOException {
        Main m = new Main();
    	m.changeScene("OrderInformation.fxml");}


    @FXML
    void logout(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("afterLogin.fxml");}

    private final ObservableList<Food> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // b1.setOnAction(this::pizzaorder);
    	// b2.setOnAction(this::burgerorder);
    	// b3.setOnAction(this::xlborder);
    	// b4.setOnAction(this::noodleorder);
    	name.setCellValueFactory(new PropertyValueFactory<Food,String>("name"));
    	// picture.setPrefWidth(80);
    	// picture.setCellValueFactory(new PropertyValueFactory<>("picture"));
    	
    	description.setCellValueFactory(new PropertyValueFactory<Food,String>("description"));
    	price.setCellValueFactory(new PropertyValueFactory<Food,Double>("price"));
    	numberoffood.setCellValueFactory(new PropertyValueFactory<Food,Integer>("numberoffood")); 
    	
    	Food f1 =new Food("pizza", "cheese,meat,veges",0, 9);
    	list.add(f1);
    	ImageView burger = new ImageView(new Image(this.getClass().getResourceAsStream("burger.png")));
   	    ImageView xiaolongbao = new ImageView(new Image(this.getClass().getResourceAsStream("xiaolongbao.png")));
   	    ImageView noodle = new ImageView(new Image(this.getClass().getResourceAsStream("noodle.png")));
   	    Food f2 =new Food("buger","meat,bread,cheese,veges", 0,10);
   	    Food f3 =new Food("xiaolongbao","dough,meat",0, 10);
   	    Food f4 =new Food("noodles", "dough",0, 11);
        list.add(f2);
   	    list.add(f3);
   	    list.add(f4);
        table.setItems(list);


    }

}
