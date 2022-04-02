public class FoodItem
{

    private String name;
    private double price;
    private int prepTimeInMins;
    private String category;
    private String[] ingredients;
    FoodItem nextItem;
    int itemNumber;

    public FoodItem(String name, double price, int prepTimeInMins, String category, String[] ingredients)
    {

        this.name = name;
        this.price = price;
        this.prepTimeInMins = prepTimeInMins;
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

    public int getPrepTime()
    {
        return prepTimeInMins;
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

    public void setPrepTime(int newPrepTimeInMins)
    {
        this.prepTimeInMins = newPrepTimeInMins;
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