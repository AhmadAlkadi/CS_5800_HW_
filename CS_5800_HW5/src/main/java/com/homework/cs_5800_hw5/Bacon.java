package com.homework.cs_5800_hw5;

public class Bacon extends ToppingDecorator{
    public Bacon(CutomerOrderItem customerOrderItem){
        super(customerOrderItem);
    }
    
    @Override
    public double getCost(){
        return customerOrderItem.getCost() + 2.00;
    }
    
    @Override
    public String getDescription() {
        return customerOrderItem.getDescription() + ", Bacon";
    }
}
