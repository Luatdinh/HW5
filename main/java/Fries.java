public class Fries implements FoodItem {
    private double price;

    public Fries(double price) {
        this.price = price;
    }

    @Override
    public double cost() {
        return this.price;
    }
}
