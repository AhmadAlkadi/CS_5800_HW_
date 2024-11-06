package com.homework.cs_5800_hw5;

class LoyaltyDiscount {
    public double applyDiscount(double total, String loyaltyStatus) {
        switch (loyaltyStatus.toLowerCase()) {
            case "gold":
                return total * 0.80;  // 20% discount
            case "silver":
                return total * 0.90;  // 10% discount
            default:
                return total;         // No discount
        }
    }
}
