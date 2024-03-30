public class Fries implements FoodItem {
    private double foodItemPrice;

    public Fries(double foodItemPrice) {
        this.foodItemPrice = foodItemPrice;
    }

    @Override
    public double cost() {
        return this.foodItemPrice;
    }
}
