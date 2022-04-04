package application;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ProfileController {

   public ProfileController() {
   }

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
      // need to save information to the database
   }

   /**
    * Gets the profile.
    *
    * @return the profile
    */
   public Profile getProfile() {
      return a;
   }

   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      user = findById(R.id.user1);
      email = findById(R.id.email1);
      fname = findById(R.id.fname);
      lname = findyId(R.id.lname);
      user1 = "";
      email1 = "";
      fname1 = "";
      lname1 = "";
   }

   private void saveProfile() throws IOException {
      // Main m = new Main();

      // profile parameters

      String typeUsername = "Username: ";
      String typePassword = "Password: ";
      // get user name

      String name;
      // username.getText().toString();
      String inputPassword;
      name = (new StringBuilder()).append(typeUsername).append(name).toString();
      // the profile
      System.out.println(name);
      System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

      inputPassword = password.getText().toString().trim();
      inputPassword = (new StringBuilder()).append(typePassword).append(inputPassword).toString();


      
      // set promp text

      public void create(View view) {
         user1 = user.getText().toString();
         email1 = email.getText().toString();
         fname1 = fname.getText().toString();
         lname1 = lname.getText().toString();
      }

      // saved it
      boolean isSave= check.checkUsernameAndPassword();
      // boolean passwordMatch;
      if (loginValid) {
         wrongLogIn.setText("Success!");
         m.changeScene("HomePage.fxml");
      } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
         wrongLogIn.setText("Please enter your data.");
      } 

   }

   // find user name throuhgh the ID
   public void findById(String customerID) throws IOException, RuntimeException {
      FileReader fr = new FileReader("ci.txt");
      // check filename
      System.out.println(this.filename);
      BufferedReader br = new BufferedReader(fr);

   }

}
