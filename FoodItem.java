import java.time.Duration;

public class FoodItem
{

    String name;
    double price;
    Duration prepTime;
    String category;
    String[] ingredients;
    FoodItem nextItem;

    public FoodItem(String name, double price, Duration prepTime, String category, String[] ingredients)
    {

        this.name = name;
        this.price = price;
        this.prepTime = prepTime;
        this.category = category;
        this.ingredients = ingredients;
        this.nextItem = null;

    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public Duration getPrepTime()
    {
        return prepTime;
    }

    public String getCategory()
    {
        return category;
    }

    public String[] getIngredients()
    {
        return ingredients;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }

    public void setPrepTime(Duration newPrepTime)
    {
        this.prepTime = newPrepTime;
    }

    public void setCategory(String newCategory)
    {
        this.category = newCategory;
    }

    public void setIngredients(String[] newIngredients)
    {
        this.ingredients = newIngredients;
    }
    
}