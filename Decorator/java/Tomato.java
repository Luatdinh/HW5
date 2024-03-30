public class Tomato extends Topping {
    private double cost;

    public Tomato(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double cost() {
        return foodItem.cost() + this.cost;
    }
}