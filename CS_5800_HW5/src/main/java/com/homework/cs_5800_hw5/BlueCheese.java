package com.homework.cs_5800_hw5;

public class BlueCheese extends ToppingDecorator{
        public BlueCheese(CutomerOrderItem customerOrderItem){
        super(customerOrderItem);
    }
    
    @Override
    public double getCost(){
        return customerOrderItem.getCost() + 1.75;
    }
    
    @Override
    public String getDescription() {
        return customerOrderItem.getDescription() + ", BlueCheese";
    }
}
