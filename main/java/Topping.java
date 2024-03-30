public abstract class Topping implements FoodItem {
    protected FoodItem foodItem;

    public Topping(FoodItem foodItem) {
        this.foodItem = foodItem;
    }
}