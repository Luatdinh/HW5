public class Burger implements FoodItem {
    private double foodItemPrice;

    public Burger(double foodItemPrice) {
        this.foodItemPrice = foodItemPrice;
    }

    @Override
    public double cost() {
        return this.foodItemPrice;
    }
}