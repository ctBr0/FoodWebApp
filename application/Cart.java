package application;
public class Cart extends Menu{
    
    public int cartID;

    public double TotalCost()
    {
        double totalCost = 0;
        FoodItem current = this.firstItem;
        while (current != null)
        {
            totalCost += current.getPrice();
            current = current.nextItem;
        }
        return totalCost;
    }

    public int TotalPrepTime()
    {
        int totalPrepTime = 0;
        FoodItem current = this.firstItem;
        while (current != null)
        {
            totalPrepTime += current.getPrepTime();
            current = current.nextItem;
        }
        return totalPrepTime;
    }
}
