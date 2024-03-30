public class Lettuce extends Topping {
    private double cost;

    public Lettuce(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double cost() {
        return foodItem.cost() + this.cost;
    }
}