package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.IOException;

public class CheckUP {
	File file;
	String filename;
	String inputUsername;
	String inputPassword;
	
	public CheckUP(String inputUsername, String inputPassword, String filename) {
		this.filename = filename;
		this.inputUsername = inputUsername;
		this.inputPassword = inputPassword;
	}
	
	public boolean checkUsernameAndPassword() throws IOException, RuntimeException {
		System.out.println("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		FileReader fr = new FileReader("ci.txt");
		System.out.println(this.filename);
        BufferedReader br = new BufferedReader(fr);
        //LineNumberReader lnr = new LineNumberReader(fr);
        
        this.file = new File("ci.txt");
        long fileLength = file.length();
        //int len = (int)fileLength;
        //int len = 31;
        //lnr.skip(fileLength);
        //int linecount = lnr.getLineNumber();
        //System.out.println(len);
        
		String s = null;

		System.out.println(inputUsername);
		//System.out.println();
		
		s = br.readLine().trim();
		System.out.println(s);
		System.out.println("---------------------------");
		int index = 0;
		int usernameIndex = 0;
		do {
			index++;
			//linecount++;
			//System.out.println(s);
			//System.out.println(2 + 6*usernameIndex);
			
			if (index == 2 + 6*usernameIndex) {
				System.out.println(s);
				s = br.readLine().trim();
				usernameIndex++;
				if ( s.equals(inputUsername)) {
					System.out.println("...........");
					System.out.println(s);
					break;
				}
			} else {
				br.readLine().trim();
			}
			/*
			if(s == null) {
				System.out.println("The strat is null");
				break;
			}else if ( s.equals(inputUsername)) {
				System.out.println("...........");
				System.out.println(s);
				break;
			}*/
			
			//index++;
		} while(br.ready());
		/*
		for (int i = 0; i < linecount; i++) {
			s = br.readLine().trim();
			System.out.println(s);
			if(s == null) {
				System.out.println("The strat is null");
				break;
			}else if ( s.equals(inputUsername)) {
				System.out.println("...........");
				System.out.println(s);
				break;
			}
			
		}*/
		
		System.out.println("the while loop is false");
		if (s == null) {
			System.out.println("!!!!!!!!!!!");
			fr.close();
			br.close();
			return false;
		} else {
			System.out.println(inputPassword);
			System.out.println("??????????????");
			s = br.readLine().trim();
			if (s.equals(inputPassword)) {
				System.out.println(s);
				System.out.println("THE PASSWORD IS CORRECT");
				fr.close();
				br.close();
				return true;
			} else {
				System.out.println(inputPassword);
				System.out.println(s);
				System.out.println("THE PASSWORD IS INCORRECT");
				fr.close();
				br.close();
				return false;
			}
		}
    }

}
