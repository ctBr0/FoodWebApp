package application;

import java.io.Serializable;

public class CustomerInfo  implements Serializable{
	//private instance variables
	private String name, userName,email,phone;
	private int password,id;
	private ID idOfCustomer;
	
	public CustomerInfo(String name, String userName, String email, String phone, int password, int id) {
		super();
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.id = id;
		idOfCustomer = new ID(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ID getIdOfCustomer() {
		return idOfCustomer;
	}

	public void setIdOfCustomer(ID idOfCustomer) {
		this.idOfCustomer = idOfCustomer;
	}
	public void setID(int id) {
		idOfCustomer.setId(id);
	}

	//return a string in a specified format
	public String toString() {
		return "\nName:\t\t" + name + "\n"
				+ "Username:\t\t" + userName + "\n"
				+ "Password\t" + password + "\n"
				+ "\t\t" + idOfCustomer.toString() + "\n";
	}
	

	

}
