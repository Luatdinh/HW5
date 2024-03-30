public class Tomato extends Topping {
    private double toppingPrice;

    public Tomato(FoodItem foodItems, double toppingPrice) {
        super(foodItems);
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double cost() {
        return foodItems.cost() + toppingPrice;
    }
}