package com.homework.cs_5800_hw5;
import java.util.ArrayList;
import java.util.List;

class Order {
    private List<CutomerOrderItem> items = new ArrayList<>();
    
    public void addItem(CutomerOrderItem item) {
        items.add(item);
    }
    
    public double calculateTotalCost() {
        double total = 0;
        for (CutomerOrderItem item : items) {
            total += item.getCost();
        }
        return total;
    }
    
    public void displayOrder() {
        System.out.println("Order Summary:");
        for (CutomerOrderItem item : items) {
            System.out.println(item.getDescription() + " - $" + item.getCost());
        }
    }
}
