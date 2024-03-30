public class Driver {
    public static void main(String[] args) {
        FoodItem burger = new Burger(6.0);
        FoodItem fries = new Fries(7.0);
        FoodItem hotDog = new HotDog(5.0);
        FoodItem burgerWithLettuce = new Lettuce(burger, 1.75);
        FoodItem burgerWithLettuceAndTomato = new Tomato(burgerWithLettuce, 2);
        FoodItem friesWithMushroom = new Mushroom(fries, 1.5);
        FoodItem friesWithMushroomAndSauce = new Sauce(friesWithMushroom, 2.25);
        FoodItem hotDogWithPickle = new Pickle(hotDog, 2.5);
        FoodItem hotDogWithPickleandSauce = new Sauce(hotDogWithPickle, 2);
        Order foodOrder = new Order();
        foodOrder.addFoodItem(burgerWithLettuceAndTomato);
        foodOrder.addFoodItem(friesWithMushroomAndSauce);
        foodOrder.addFoodItem(hotDogWithPickleandSauce);
        double totalPrice = foodOrder.getTotalCostOfFoodItems();
        System.out.print("- Total cost of foods without discount is $");
        System.out.println(totalPrice);
        CustomerLoyaltyStatus customerLoyaltyStatus= new CustomerLoyaltyStatus(0.2);
        double finalPrice = customerLoyaltyStatus.applyADiscount(totalPrice);
        System.out.print("- Total cost of foods with discount is $");
        System.out.println(finalPrice);
    }
}