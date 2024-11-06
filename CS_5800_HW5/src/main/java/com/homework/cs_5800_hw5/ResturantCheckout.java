package com.homework.cs_5800_hw5;

public class ResturantCheckout {
    public static void main(String[] args) {
        CutomerOrderItem burger = new Burger();
        CutomerOrderItem cheeseBurger = new Cheese(new Burger());
        CutomerOrderItem baconCheeseBurger = new Bacon(new Cheese(new Burger()));
        //CutomerOrderItem MushroomsBaconCheeseBurger = new Mushrooms(new Bacon(new Cheese(new Burger())));
        
        CutomerOrderItem fries = new Fries();
        CutomerOrderItem loadedFries = new Cheese(new Bacon(new Fries()));
        
        CutomerOrderItem honeyLemonDressingSalad = new HoneyLemonDressing(new Salad());
        
        CutomerOrderItem hotDog = new HotDog();
        
        // Create an order and add items
        Order order = new Order();
        order.addItem(burger);
        order.addItem(cheeseBurger);
        order.addItem(baconCheeseBurger);
        order.addItem(fries);
        order.addItem(loadedFries);
        order.addItem(honeyLemonDressingSalad);
        order.addItem(hotDog);
        
        // Display order details
        order.displayOrder();
        
        // Calculate total cost
        double totalCost = order.calculateTotalCost();
        System.out.println("Total Cost: $" + totalCost);
        
        // Apply loyalty discount
        LoyaltyDiscount loyaltyDiscount = new LoyaltyDiscount();
        double discountedTotal = loyaltyDiscount.applyDiscount(totalCost, "gold");
        System.out.println("Discounted Total (Gold Member): $" + String.format("%.2f", discountedTotal));
    }
    
}
