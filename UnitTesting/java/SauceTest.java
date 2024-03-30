import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SauceTest {
    @Test
    public void testCost() {
        FoodItem fries = new Fries(2.5);
        FoodItem friesWithSauce = new Sauce(fries, 0.20);
        Assertions.assertEquals(2.70, friesWithSauce.cost(), "Fries with sauce cost is incorrect.");
    }
}
