package com.homework.cs_5800_hw5;

public class Mushrooms extends ToppingDecorator{
        public Mushrooms(CutomerOrderItem customerOrderItem){
        super(customerOrderItem);
    }
    
    @Override
    public double getCost(){
        return customerOrderItem.getCost() + 0.75;
    }
    
    @Override
    public String getDescription() {
        return customerOrderItem.getDescription() + ", Mushrooms";
    }
}
