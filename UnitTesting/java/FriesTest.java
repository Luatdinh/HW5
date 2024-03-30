import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FriesTest {
    @Test
    public void testFriesCost() {
        Fries fries = new Fries(2.0);
        Assertions.assertEquals(2.0, fries.cost(), "Fries cost is incorrect.");
    }
}
