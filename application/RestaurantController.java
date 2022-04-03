package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RestaurantController {

    @FXML
    private TableView<?> animals;

    @FXML
    private TableColumn<?, ?> idCol;

    @FXML
    private TableColumn<?, ?> typeCol;

    @FXML
    private TableColumn<?, ?> typeCol1;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TableColumn<?, ?> typeCol2;

    @FXML
    private TextField inputId1;

    @FXML
    private TextField inputFoodName;

    @FXML
    private TextField inputPicture;

    @FXML
    private TextField inputName;

    @FXML
    private TextField inputPrice;

    @FXML
    void rowClicked(MouseEvent event) {
        Menu clickedMenu = Menu.getSelectionModel().getSelectedItem();
        inputFoodId.setText(String.valueOf(menu.getId()));
        inputFoodName.setText(String.valueOf(menu.getName()));
        inputPrice.setText(String.valueOf(menu.getPrice()));
        inputPreTime.setText(String.valueOf(menu.getPrepTime()));
        inputCategory.setText(String.valueOf(menu.getCategory()));
        // inputIngredients.setText(String.valueOf(menu.getIngredients()));

    }

    @FXML
    void submit(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idCol.setCellValueFactory(new PropertyValueFactory<FoodItem, Integer>("Item number"));
        typeCol.setCellValueFactory(new PropertyValueFactory<FoodItem, String>("Name"));
        nameCol.setCellValueFactory(new PropertyValueFactory<FoodItem, String>("Price"));
        preTCol.setCellValueFactory(new PropertyValueFactory<FoodItem, Integer>("Preparation Time"));
        cateCol.setCellValueFactory(new PropertyValueFactory<FoodItem, String>("Category"));
        // nameCol.setCellValueFactory(new PropertyValueFactory<FoodItem, String>("Ingredients"));
        setupTable();
    }


    private void setupTable(){
        FoodlList list = new FoodList("");

        // animals.getItems().addAll(menu1,men2,menu3);
        
    }



}
