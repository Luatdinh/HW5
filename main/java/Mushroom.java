public class Mushroom extends Topping {
    private double cost;

    public Mushroom(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double cost() {
        return foodItem.cost() + this.cost;
    }
}