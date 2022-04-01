

import PaymentInfo.java;

public class Customer{
private String username;
public int customerId;
private String password;
private String email;
private String phoneNumber;
private int numOfVisits;
public PaymentInfo p;

}

public void setUsername:(String username){
	this.username= username;
}

public static void setPassword(String password){
	this.password = password;
}

public void getUsername(){
   return username;
}
public void getPassword(){
	return password;
}

public void login(){
	try(Scanner scanner = new Scanner(System.in)){
	 String username = scanner.nextLine();
	 String password = scanner.nextLine();
	 if (username != null && password != null){
       return true;		 
	}
	else{return false;}}
}
public void setNumofVistis(int numofvisits){
	this.numofvisits = numOfVisits;
}
private void displayPaymentInfo(PaymentInfo){
	return p;
}
