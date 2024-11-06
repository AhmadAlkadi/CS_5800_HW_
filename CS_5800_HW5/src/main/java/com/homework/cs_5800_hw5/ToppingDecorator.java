package com.homework.cs_5800_hw5;

abstract class ToppingDecorator implements CutomerOrderItem{
    protected CutomerOrderItem customerOrderItem;
    
    public ToppingDecorator(CutomerOrderItem customerOrderItem){
        this.customerOrderItem = customerOrderItem;
    }
    
    public abstract String getDescription();
}
