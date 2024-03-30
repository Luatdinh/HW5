public class CustomerLoyaltyStatus {
    private double discount;

    public CustomerLoyaltyStatus(double discount) {
        this.discount = discount;
    }

    public double applyADiscount(double totalPrice) {
        return (1 - discount) * totalPrice ;
    }
}