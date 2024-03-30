import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MushroomTest {
    @Test
    public void testCost() {
        FoodItem burger = new Burger(5.0);
        FoodItem burgerWithMushroom = new Mushroom(burger, 1.00);
        Assertions.assertEquals(6.00, burgerWithMushroom.cost(), "Burger with mushroom cost is incorrect.");
    }
}
