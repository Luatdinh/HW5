public class HotDog implements FoodItem {
    private double foodItemPrice;

    public HotDog(double foodItemPrice) {
        this.foodItemPrice = foodItemPrice;
    }

    @Override
    public double cost() {
        return this.foodItemPrice;
    }
}
