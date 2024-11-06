
package com.homework.cs_5800_hw5;

public class Salad implements CutomerOrderItem{
    
    @Override
    public String getDescription() {
        return "Salad";
    }

    @Override
    public double getCost() {
        return 4.5;
    }
}
