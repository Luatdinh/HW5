import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriesTest {
    @Test
    public void testCost() {
        Fries fries = new Fries(2.0);
        Assertions.assertEquals(2.0, fries.cost());
    }
}
