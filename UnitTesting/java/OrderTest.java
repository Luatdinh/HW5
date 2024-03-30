import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest {
    @Test
    public void testTotalCost() {
        FoodItem burger = new Burger(3.0);
        FoodItem fries = new Fries(2.0);
        Order order = new Order();
        order.addFoodItem(burger);
        order.addFoodItem(fries);
        Assertions.assertEquals(5.0, order.getTotalCostOfFoodItems(), "Order cost is incorrect.");
    }
}
