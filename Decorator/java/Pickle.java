public class Pickle extends Topping {
    private double cost;

    public Pickle(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double cost() {
        return foodItem.cost() + this.cost;
    }
}