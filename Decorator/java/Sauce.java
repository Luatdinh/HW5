public class Sauce extends Topping {
    private double cost;

    public Sauce(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double cost() {
        return foodItem.cost() + this.cost;
    }
}