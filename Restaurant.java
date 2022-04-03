package application;

public class Restaurant {
    String restaurantName = "";
    String email = "";
    // Menu foodList<int>;
    int discountNumber = 0;
    // FoodItem <Integer,Menu> foodlist =new FoodItem(name, price, prepTimeInMins,
    // category, ingredients)<Menu>();

    // getter and setter
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // public int getDiscountNumber() {
    //     return discountNumber;
    // }

    // public void setDiscountNumber(int discountNumber) {
    //     this.discountNumber = discountNumber;
    // }

    // public void giveDiscount(int customerId, int count, int numVisit) {
    //     if (numVisit == 0) {
    //         order

    //     } else {
    //         int discount = numVisit * count;

    //     }

    // }

}
