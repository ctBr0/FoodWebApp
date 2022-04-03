package application;


import java.time.Duration;

public class FoodItem {

	    String foodName,picture,description;
	    int price;
	    int numberoffood;
	    
		public FoodItem(String foodName, String picture, String description, int price, int numberoffood) {
			super();
			this.foodName = foodName;
			this.picture = picture;
			this.description = description;
			this.price = price;
			this.numberoffood = numberoffood;
		}
		public String getName() {
			return foodName;
		}
		public void setName(String foodName) {
			this.foodName = foodName;
		}
		public String getPicture() {
			return picture;
		}
		public void setPicture(String picture) {
			this.picture = picture;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getNumberoffood() {
			return numberoffood;
		}
		public void setNumberoffood(int numberoffood) {
			this.numberoffood = numberoffood;
		}	    
}
