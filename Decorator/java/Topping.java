public abstract class Topping implements FoodItem {
    protected FoodItem foodItems;

    public Topping(FoodItem foodItems) {
        this.foodItems = foodItems;
    }
}