/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.cs_5800_hw5;


public class GrilledChicken extends ToppingDecorator{
    public GrilledChicken(CutomerOrderItem customerOrderItem){
        super(customerOrderItem);
    }
    
    @Override
    public double getCost(){
        return customerOrderItem.getCost() + 3.50;
    }
    
    @Override
    public String getDescription() {
        return customerOrderItem.getDescription() + ", GrilledChicken";
    }
}
