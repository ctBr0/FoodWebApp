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

    }

    @FXML
    void submit(ActionEvent event) {

    }

}
