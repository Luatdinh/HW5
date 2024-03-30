public class Lettuce extends Topping {
    private double toppingPrice;

    public Lettuce(FoodItem foodItems, double toppingPrice) {
        super(foodItems);
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double cost() {
        return foodItems.cost() + toppingPrice;
    }
}