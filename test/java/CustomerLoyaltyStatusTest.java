import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerLoyaltyStatusTest {

    @Test
    public void applyDiscount_withTenPercentDiscount() {
        CustomerLoyaltyStatus loyaltyStatus = new CustomerLoyaltyStatus(0.1);
        double totalCost = 100.0;
        double expectedCostAfterDiscount = 90.0;

        double actualCostAfterDiscount = loyaltyStatus.applyDiscount(totalCost);

        Assertions.assertEquals(expectedCostAfterDiscount, actualCostAfterDiscount, 0.01,
                "The discounted cost does not match the expected value.");
    }

    @Test
    public void applyDiscount_withNoDiscount() {
        CustomerLoyaltyStatus loyaltyStatus = new CustomerLoyaltyStatus(0.0);
        double totalCost = 100.0;
        double expectedCostAfterDiscount = 100.0;

        double actualCostAfterDiscount = loyaltyStatus.applyDiscount(totalCost);

        Assertions.assertEquals(expectedCostAfterDiscount, actualCostAfterDiscount, 0.01,
                "The cost should remain unchanged as no discount is applied.");
    }
}
