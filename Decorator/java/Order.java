import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> foodItems = new ArrayList<>();

    public void addFoodItem(FoodItem item) {
        foodItems.add(item);
    }

    public double getTotalCostOfFoodItems() {
        double finalPrices = 0.0;

        for (FoodItem item : foodItems) {
            finalPrices = finalPrices + item.cost();
        }

        return finalPrices;
    }
}