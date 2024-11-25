/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.vending_machine;

public class Idle implements StateOfVendingMachine{
    private VendingMachine vendingMachine;
    
    public Idle(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void selectSnack(String name){
        vendingMachine.setSelectSnack(name);
        System.out.println("Selected Snack: " + name + ", Price of Snack: $" + vendingMachine.getPriceOfselectedSnack());
        vendingMachine.setCurrentState(vendingMachine.getWaitingForMoneyState());
    }
    
    @Override
    public void insertMoney(double amount){
        System.out.println("Snack should be first selected before you could inset money.");
    }
    
    @Override
    public void dispenseSnack(){
        System.out.println("Snack should be first selected before the machine could dispense a snack.");
    }
}
