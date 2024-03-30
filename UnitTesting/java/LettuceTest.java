import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LettuceTest {
    @Test
    public void testCost() {
        FoodItem burger = new Burger(5.0);
        FoodItem burgerWithLettuce = new Lettuce(burger, 0.75);
        Assertions.assertEquals(5.75, burgerWithLettuce.cost(), "Burger with lettuce cost is incorrect.");
    }
}
