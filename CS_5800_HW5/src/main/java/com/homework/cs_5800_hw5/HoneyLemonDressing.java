package com.homework.cs_5800_hw5;

public class HoneyLemonDressing extends ToppingDecorator{
    public HoneyLemonDressing(CutomerOrderItem customerOrderItem){
        super(customerOrderItem);
    }
    
    @Override
    public double getCost(){
        return customerOrderItem.getCost() + 0.75;
    }
    
    @Override
    public String getDescription() {
        return customerOrderItem.getDescription() + ", HoneyLemonDressing";
    }
}
