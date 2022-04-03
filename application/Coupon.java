package application;
public class Coupon {
    
    private double discountPerc; //Discount percentage: 0.4 - 40% off

    public Coupon(double discountPerc)
    {
        this.discountPerc = discountPerc;
    }

    public void setDiscountPerc(int newPerc)
    {
        this.discountPerc = newPerc;
    }

    public double getDiscountPerc()
    {
        return this.discountPerc;
    }
}
