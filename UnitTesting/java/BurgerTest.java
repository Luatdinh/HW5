import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BurgerTest {
    @Test
    public void testCost() {
        Burger burger = new Burger(3.0);
        Assertions.assertEquals(3.0, burger.cost());
    }
}
