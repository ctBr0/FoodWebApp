package application;
public class Order {
    
    private int orderID;
    private int waitingTime; // sum of prep times ahead of current user
    private double finalPrice; // after discount
    private Cart cart;
    private int numberOfOrdersAhead;

    public void setWaitingTime()
    {
        int waitingTime = 0;
        waitingTime += cart.TotalPrepTime();
        return waitingTime;
    }
} 
