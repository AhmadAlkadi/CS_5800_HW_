package com.homework.cs_5800_hw5;

public class Burger implements CutomerOrderItem{
    
    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public double getCost() {
        return 8.0;
    }
}
