public class Pickle extends Topping {
    private double toppingPrice;

    public Pickle(FoodItem foodItems, double toppingPrice) {
        super(foodItems);
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double cost() {
        return foodItems.cost() + toppingPrice;
    }
}