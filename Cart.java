public class Cart extends Menu{
    
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

}
