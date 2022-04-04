package application;
import java.time.Duration;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class Food {
	String name,description;
	double price;
    int numberoffood;
    FoodItem nextItem;
    int itemNumber;
    
	public Food(String name, String description, int numberoffood,double price) {
		super();
		this.name = name;
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

	public int getNumberoffood() {
		return numberoffood;
	}

	public void setNumberoffood(int numberoffood) {
		this.numberoffood = numberoffood;
	}
	
}
