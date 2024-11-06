package com.homework.cs_5800_hw5;

public class HotDog implements CutomerOrderItem{
    @Override
    public String getDescription() {
        return "HotDog";
    }

    @Override
    public double getCost() {
        return 6.0;
    }
}
