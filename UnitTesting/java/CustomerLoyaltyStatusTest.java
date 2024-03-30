import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerLoyaltyStatusTest {

    @Test
    public void testApplyDiscountWithTenPercentDiscount() {
        CustomerLoyaltyStatus customerLoyaltyStatus = new CustomerLoyaltyStatus(0.1);
        double totalCost = 100.0;
        double expectedCostAfterDiscount = 90.0;

        double actualCostAfterDiscount = customerLoyaltyStatus.applyADiscount(totalCost);

        Assertions.assertEquals(expectedCostAfterDiscount, actualCostAfterDiscount,
                "The discounted cost does not match the expected value.");
    }

    @Test
    public void testApplyDiscountWithNoDiscount() {
        CustomerLoyaltyStatus customerLoyaltyStatus = new CustomerLoyaltyStatus(0.0);
        double totalCost = 100.0;
        double expectedCostAfterDiscount = 100.0;

        double actualCostAfterDiscount = customerLoyaltyStatus.applyADiscount(totalCost);

        Assertions.assertEquals(expectedCostAfterDiscount, actualCostAfterDiscount,
                "The cost should remain unchanged as no discount is applied.");
    }
}
