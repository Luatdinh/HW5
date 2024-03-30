public class CustomerLoyaltyStatus {
    private double discount;

    public CustomerLoyaltyStatus(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double totalCost) {
        return (1 - discount) * totalCost ;
    }
}