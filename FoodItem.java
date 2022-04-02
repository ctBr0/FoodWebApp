import java.time.Duration;

public class FoodItem
{

    private String name;
    private double price;
    private Duration prepTime;
    private String category;
    private String[] ingredients;
    FoodItem nextItem;
    int itemNumber;

    public FoodItem(String name, double price, Duration prepTime, String category, String[] ingredients)
    {

        this.name = name;
        this.price = price;
        this.prepTime = prepTime;
        this.category = category;
        this.ingredients = ingredients;
        this.nextItem = null;
        this.itemNumber = 0;

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