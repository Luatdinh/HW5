import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToppingTest {
    @Test
    public void testToppingCost() {
        FoodItem burger = new Burger(3.0);
        Tomato tomato = new Tomato(burger, 0.5);
        Assertions.assertEquals(3.5, tomato.cost());
    }
}
