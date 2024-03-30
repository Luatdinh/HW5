public class Sauce extends Topping {
    private double toppingPrice;

    public Sauce(FoodItem foodItems, double toppingPrice) {
        super(foodItems);
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double cost() {
        return foodItems.cost() + toppingPrice;
    }
}