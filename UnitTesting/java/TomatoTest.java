import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TomatoTest {
    @Test
    public void testCost() {
        FoodItem burger = new Burger(5.0);
        FoodItem burgerWithTomato = new Tomato(burger, 0.50);
        Assertions.assertEquals(5.50, burgerWithTomato.cost(), "Burger with tomato cost is incorrect.");
    }
}
