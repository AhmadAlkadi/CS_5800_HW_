/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.vending_machine;

import java.text.DecimalFormat;

public class WaitingForMoney implements StateOfVendingMachine{
    private VendingMachine vendingMachine;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public WaitingForMoney(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void selectSnack(String name){
        System.out.println("Snack already selected.");
    }
    
    @Override
    public void insertMoney(double amount){
        vendingMachine.setInsertMoney(amount);
        System.out.println("Money Inserted: $" + amount);
        if(amount >= vendingMachine.getPriceOfselectedSnack()){
            if(amount-vendingMachine.getPriceOfselectedSnack() != 0)
                System.out.println("Here is your change: $" + df.format(amount-vendingMachine.getPriceOfselectedSnack()));
            vendingMachine.setCurrentState(vendingMachine.getDispensingSnackState());
        }else{
            System.out.println("Insereted money was not enough the item price is :" + vendingMachine.getPriceOfselectedSnack());
        }
        
    }
    
    @Override
    public void dispenseSnack(){
        System.out.println("Please pay beofre dispensing the item.");
    }
}
