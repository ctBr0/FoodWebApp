package application;
import javafx.scene.image.ImageView;
import java.time.Duration;
// import java.util.Locale.Category;

public class FoodlList {
    String foodName,description;
    ImageView picture;
    double price;
    int foodId;
    // int itemNumber;
    Duration prepTime;
    String category;

		public String getFoodName() {
			return foodName;
		}

		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}

		public ImageView getPicture() {
			return picture;
		}

		public void setPicture(ImageView picture) {
			this.picture = picture;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}


		public int getFoodId() {
			return foodId;
		}

		public void setFoodId(int foodId) {
			this.foodId = foodId;
		}

		public Duration getPrepTime() {
			return prepTime;
		}

		public void setPrepTime(Duration prepTime) {
			this.prepTime = prepTime;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
  
}
// @Override
// public FoodList(String foodName, ImageView picture, String description, double price, Duration prepTime,String category){
	    
//     this.foodName = foodName;
//     this.price = price;
//     this.picture = picture;
//     this.prepTime = prepTime;
//     this.category = category;
//     // this.nextItem = null;
// }
