import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PickleTest {
    @Test
    public void testPickleCost() {
        FoodItem hotDog = new HotDog(3.0);
        FoodItem hotDogWithPickle = new Pickle(hotDog, 0.30);
        Assertions.assertEquals(3.30, hotDogWithPickle.cost(), "Hot dog with pickle cost is incorrect.");
    }
}
