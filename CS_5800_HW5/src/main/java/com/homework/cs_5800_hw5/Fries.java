package com.homework.cs_5800_hw5;

public class Fries implements CutomerOrderItem{
   
    @Override
    public String getDescription() {
        return "Fries";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}
