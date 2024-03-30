public class HotDog implements FoodItem {
    private double price;

    public HotDog(double price) {
        this.price = price;
    }

    @Override
    public double cost() {
        return this.price;
    }
}
