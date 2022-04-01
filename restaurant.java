public void class Restaurant(){
public String resName;
public String email;
public foodList Menu;
public int discountNumber;
}

public void getResName()
{return ResName;}

public void getEmail()
{return email;}
public void setResName(String resName)
{this.resName = resName;}
public void setEmail(String email)
{this.email = email;}
public void giveDiscounr(int customerId, int count, int numofvisits){
	if (customerId != null){
	if (numofvisits >=5){
		count = 0.8;
	}
	else if(numofvisits >=10){
	    count = 0.6;
	}
	}
}