package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {
	File file;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button register;

    @FXML
    private TextField email;

    @FXML
    private TextField phone;
    
    @FXML
    void register(ActionEvent event) throws IOException {
    	//store the information to database use text or my sql
    	String name = username.getText().toString();
    	String inputPassword = password.getText().toString();
    	String inputEmail = email.getText().toString();
    	String inputPhone = phone.getText().toString();
    	String typeUsername = "Username: ";
    	String typePassword = "Password: ";
    	String typeEmail = "Email: ";
    	String typePhone = "Phone: ";
    	
		name = (new StringBuilder()).append(typeUsername).append(name).toString();
		inputPassword = (new StringBuilder()).append(typePassword).append(inputPassword).toString();
		inputEmail = (new StringBuilder()).append(typeEmail).append(inputEmail).toString();
		inputPhone = (new StringBuilder()).append(typePhone).append(inputPhone).toString();

		System.out.println(name + "\n");
		System.out.println(inputPassword + "\n");
		System.out.println(inputEmail + "\n");
		System.out.println(inputPhone + "\n");
    	
    	FileReader fr = new FileReader("CustomerInformation.txt");
        BufferedReader br = new BufferedReader(fr);
        long lines = 0;
    	this.file = new File("CustomerInformation.txt");
    	FileReader fileReader = new FileReader(file);
    	//String y = br.readLine().trim();//first line
    	LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
        lineNumberReader.skip(Long.MAX_VALUE);
        lines = lineNumberReader.getLineNumber() + 1;
		System.out.println(lines);
        fileReader.close();
        lineNumberReader.close();
        lines = lines - 7;
        System.out.println(lines);
        if(br.readLine() == null) {
        	File file = new File("CustomerInformation.txt");
	    	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	String idType = "ID: ";
	    	String idNumber = "1";
			String n = (new StringBuilder()).append(idType).append(idNumber).toString();
			//System.out.println("I am in test the write");
		    bw.write(n + "\n");
		    bw.write("Name: jjjjj\n");
		    bw.write(name + "\n");
		    bw.write(inputPassword + "\n");
		    bw.write(inputEmail + "\n");
		    bw.write(inputPhone + "\n");
		    bw.flush();
		    bw.close();
		    //System.out.println("Done");
		    fr.close();
		    br.close();
			Main m = new Main();
			m.changeScene("HomePage.fxml");
        }else if(lines == 0) {
        	String idNumber = "2";
			String idType = "ID: ";
			idNumber = (new StringBuilder()).append(idType).append(idNumber).toString();
			System.out.println(idNumber);
			File file = new File("CustomerInformation.txt");
	    	BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));

		    bw.write("\n" + idNumber + "\n");
		    bw.write("Name: jjjjj\n");
		    bw.write(name + "\n");
		    bw.write(inputPassword + "\n");
		    bw.write(inputEmail + "\n");
		    bw.write(inputPhone + "\n");
		    bw.flush();
		    bw.close();
		    //System.out.println("Done");
		    fr.close();
		    br.close();
			Main m = new Main();
			m.changeScene("HomePage.fxml");
            
        }else {
        	int index = 0;
            String txt = " ";
            String n = "";
        	System.out.println("I am here");

            while (txt != null) {
    			index++;
    			txt = br.readLine().trim();
    			System.out.println(txt);
    			if (index == lines) {
    				System.out.println(txt);
    				String[] strs = txt.split(": ");
    				String userID = strs[1];
    				int i = Integer.parseInt(userID);
    				i = i+1;
    				String idNumber = Integer.toString(i);
    				String idType = "ID: ";
    				n = (new StringBuilder()).append(idType).append(idNumber).toString();
    				System.out.println(n);
    				File file = new File("CustomerInformation.txt");
    		    	BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));

    			    bw.write("\n" + n + "\n");
    			    bw.write("Name: jjjjj\n");
    			    bw.write(name + "\n");
    			    bw.write(inputPassword + "\n");
    			    bw.write(inputEmail + "\n");
    			    bw.write(inputPhone + "\n");
    			    bw.flush();
    			    bw.close();
    			    //System.out.println("Done");
    			    fr.close();
    			    br.close();
    				Main m = new Main();
    				m.changeScene("HomePage.fxml");
    			//System.exit(0);
    				}
    			}
//          fr.close();
//    		br.close();
        }
        

       
    }

}

