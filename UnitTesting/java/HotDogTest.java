import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotDogTest {
    @Test
    public void testHotDogCost() {
        HotDog hotDog = new HotDog(4.0);
        Assertions.assertEquals(4.0, hotDog.cost(), "HotDog cost is incorrect.");
    }
}
