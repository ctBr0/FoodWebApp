public class Customer{
	
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	private PaymentInfo paymentInfo;
	public Coupon[] coupons;
	public int customerId;

	public Customer(String username, String password, String email, String phoneNumber)
	{
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.coupons = null;
		this.paymentInfo = null;
		this.customerID = 
	}

	public void setPaymentInfo(PaymentInfo newPaymentInfo)
	{
		this.paymentInfo = newPaymentInfo;
	}

	public PaymentInfo getPaymentInfo()
	{
		return this.paymentInfo;
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
