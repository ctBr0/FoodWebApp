import java.time.Duration;

public class Cart {
    
    FoodItem firstItem;

    public void AddItem(String name, double price, Duration prepTime, String category, String[] ingredients)
    {

        FoodItem newItem = new FoodItem(name, price, prepTime, category, ingredients);

        if (this.firstItem == null)
        {
            this.firstItem = newItem;
            newItem.itemNumber = 1;
        }
        else
        {
            FoodItem current = this.firstItem;
            int itemNumber = 2;
            while (current.nextItem != null)
            {
                current = current.nextItem;
                itemNumber++;
            }
            current.nextItem = newItem;
            newItem.itemNumber = itemNumber;
        }
    }

    public void DeleteItem(int itemNumber)
    {
        if (this.NumberOfItems() == 0)
        {
            System.out.println("The cart is empty!");
        }
        else if (this.firstItem.itemNumber == itemNumber)
        {
            this.firstItem = this.firstItem.nextItem;
        }
        else
        {
            FoodItem current = this.firstItem;
            FoodItem previous = current;
            while (current.nextItem != null && current.itemNumber != itemNumber)
            {
                previous = current;
                current = current.nextItem;
            }
            
            if (current.itemNumber == itemNumber)
            {
                previous.nextItem = current.nextItem;
            }
            else
            {
                System.out.println("Item does not exist!");
            }
        }
    }

    public int NumberOfItems()
    {
        int numberOfItems = 0;
        if (this.firstItem != null)
        {
            numberOfItems++;
            FoodItem current = this.firstItem;
            while (current.nextItem != null)
            {
                current = current.nextItem;
                numberOfItems++;
            }
        }
        return numberOfItems;
    }

    public void DeleteAll()
    {
        this.firstItem = null;
    }

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

    public void PrintCart()
    {
        if (this.NumberOfItems() == 0)
        {
            System.out.println("The cart is empty!");
        }
        else
        {
            FoodItem current = this.firstItem;
            while (current != null)
            {
                System.out.println("Item number: " + current.itemNumber);
                System.out.println("Name: " + current.getName());
                System.out.println("Price: " + current.getPrice());
                System.out.println("Preparation time: " + current.getPrepTime());
                System.out.println("Category: " + current.getCategory());
                System.out.println("Ingredients: " + current.getIngredients());
                System.out.println();
                current = current.nextItem;
            }
        }
    }
}