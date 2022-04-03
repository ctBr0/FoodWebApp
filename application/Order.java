package application;
public class Order {
    
    public int orderID;
    private int waitingTime; // sum of prep times ahead of current user
    private double finalPrice; // after discount
    private Cart cart;
    private int numberOfOrdersAhead;

    public void setWaitingTime()
    {
        
    }
} 
