/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.vending_machine;

public class Snack {
    private String name;
    private double price;
    private int quantity;
    
    public Snack(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void quantityDecrement(){
        if(quantity > 0){
            quantity--;
        }
    }
    
    public boolean availability(){
        return quantity > 0;
    }
}
