package com.homework.cs_5800_hw5;

public class Cheese extends ToppingDecorator{
    public Cheese(CutomerOrderItem customerOrderItem){
        super(customerOrderItem);
    }
    
    @Override
    public double getCost(){
        return customerOrderItem.getCost() + 1.50;
    }
    
    @Override
    public String getDescription() {
        return customerOrderItem.getDescription() + ", Cheese";
    }
}
