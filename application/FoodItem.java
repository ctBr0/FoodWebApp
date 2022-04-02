package application;


import java.time.Duration;

public class FoodItem {

	    String name,picture,description;
	    double price;
	    int numberoffood;
	    
		public FoodItem(String name, String picture, String description, double price, int numberoffood) {
			super();
			this.name = name;
			this.picture = picture;
			this.description = description;
			this.price = price;
			this.numberoffood = numberoffood;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
	    //Duration prepTime;
	    //String category;
	    //String[] ingredients;
	    //FoodItem nextItem;

//	    public FoodItem(String name, double price, Duration prepTime, String category, String[] ingredients){
//
//	        this.name = name;
//	        this.price = price;
//	        this.prepTime = prepTime;
//	        this.category = category;
//	        this.ingredients = ingredients;
//	        this.nextItem = null;
//	    }
//
//	    public String getName()
//	    {
//	        return name;
//	    }
//
//	    public double getPrice()
//	    {
//	        return price;
//	    }
//
//	    public Duration getPrepTime()
//	    {
//	        return prepTime;
//	    }
//
//	    public String getCategory()
//	    {
//	        return category;
//	    }
//
//	    public String[] getIngredients()
//	    {
//	        return ingredients;
//	    }
//
//	    public void setName(String newName)
//	    {
//	        this.name = newName;
//	    }
//
//	    public void setPrice(double newPrice)
//	    {
//	        this.price = newPrice;
//	    }
//
//	    public void setPrepTime(Duration newPrepTime)
//	    {
//	        this.prepTime = newPrepTime;
//	    }
//
//	    public void setCategory(String newCategory)
//	    {
//	        this.category = newCategory;
//	    }
//
//	    public void setIngredients(String[] newIngredients)
//	    {
//	        this.ingredients = newIngredients;
//	    }
//	    
//	}
