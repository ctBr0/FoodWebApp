package application;

import java.util.ArrayList;
public class Customer{
	
	private String name;
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	private PaymentInfo paymentInfo;
	private Cart cart;
	private ArrayList<Order> orders;
	public ArrayList<Coupon> coupons;
	public int customerId;

	public Customer(String name, String username, String password, String email, String phoneNumber)
	{
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.paymentInfo = null;
		this.cart = null;
		this.orders = null;
		this.coupons = null;
		this.customerID = 
	}

	public void addCoupon(Coupon newCoupon)
	{
		this.coupons.add(newCoupon);
	}

	public void login(){
		try(Scanner scanner = new Scanner(System.in)){
		String username = scanner.nextLine();
		String password = scanner.nextLine();
		if (username != null && password != null){
    		return true;		 
		}
		else
		{
			return false;
		}
	}
}
