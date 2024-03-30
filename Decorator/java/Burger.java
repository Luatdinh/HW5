public class Burger implements FoodItem {
    private double price;

    public Burger(double price) {
        this.price = price;
    }

    @Override
    public double cost() {
        return this.price;
    }
}