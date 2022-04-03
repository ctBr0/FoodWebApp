package application;


import java.time.Duration;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class FoodItem {

	    String name,description;
	    ImageView picture;
	    double price;
	    Button numberoffood;
	    FoodItem nextItem;
	    int itemNumber;
		public FoodItem(String name, ImageView picture, String description, double price, Button numberoffood) {
			super();
			this.name = name;
			this.picture = picture;
			this.description = description;
			this.price = price;
			this.numberoffood = numberoffood;
			this.nextItem = null;
	        this.itemNumber = 0;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public ImageView getPicture() {
			return picture;
		}
		public void setPicture(ImageView picture) {
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
		public void setPrice(double price) {
			this.price = price;
		}
		public Button getNumberoffood() {
			return numberoffood;
		}
		public void setNumberoffood(Button numberoffood) {
			this.numberoffood = numberoffood;
		}	    
}
