package application;
import javafx.fxml.FXML;
import java.io.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
public class LogInController {

    public LogInController() {

    }
    
    
    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    
    @FXML
    private Button signupButton;

    @FXML
    void userSignup(ActionEvent event) throws IOException{
    	Main m = new Main();
    	m.changeScene("register.fxml");
    }


    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();

    }
    private void checkLogin() throws IOException {
    	
        Main m = new Main();
		String typeUsername = "Username: ";
		String typePassword = "Password: ";
		String name = username.getText().toString();
		String inputPassword;
		name = (new StringBuilder()).append(typeUsername).append(name).toString();
		System.out.println(name);
		System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

		inputPassword = password.getText().toString().trim();
		inputPassword = (new StringBuilder()).append(typePassword).append(inputPassword).toString();
        
		CheckUP check = new CheckUP(name, inputPassword, "Ci.txt");
		
		//need to check if the username and the password is correct within the data base
//        FileReader fr=new FileReader("CustomerInformation.txt");
//        BufferedReader br=new BufferedReader(fr);
//        int linecount = 0;
        
//		InputStreamReader isr = new InputStreamReader(System.in );
//		BufferedReader stdin = new BufferedReader(isr);
//		file = new File(filename);
//		String s = "";
//		String type = "Username: ";
//		String name = username.getText().toString();
//		name = (new StringBuilder()).append(type).append(name).toString();
		
		
//		while((s = br.readLine()) == name || (s=br.readLine())!=null) {
//			 linecount++;
//           int indexfound=s.indexOf(name);
//             if (indexfound>-1){
            	 
//             }
//		}
		
        
        
        boolean loginValid = check.checkUsernameAndPassword();
        //boolean passwordMatch;
        if (loginValid){
            wrongLogIn.setText("Success!");
            m.changeScene("HomePage.fxml"); 	        	
        }else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Please enter your data.");
        }else {
            wrongLogIn.setText("Wrong username or password!");
        }        
    }


