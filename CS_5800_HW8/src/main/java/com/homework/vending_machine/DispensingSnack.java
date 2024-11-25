/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.vending_machine;

public class DispensingSnack implements StateOfVendingMachine{
    private VendingMachine vendingMachine;
    
    public DispensingSnack(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    
    @Override
    public void selectSnack(String name){
        System.out.println("Snack already selected.");
    }
    
    @Override
    public void insertMoney(double amount){
        System.out.println("Snack already payed.");
    }
    
    @Override
    public void dispenseSnack(){
        Snack snack = vendingMachine.getSnackByName(vendingMachine.getSelectedSnackName());
        if(snack != null){
            if(snack.getQuantity()!= 0){
                snack.quantityDecrement();
                System.out.println("Dispensing snack: "+ vendingMachine.getSelectedSnackName());
                System.out.println("Current Quantity: " + snack.getQuantity());
                vendingMachine.setInsertMoney(0);
                vendingMachine.setCurrentState(vendingMachine.getIdleState());
            }
            else {
                System.out.println("There are no more " + snack.getName() + " in this vending machine.");
            }
        }else{
            System.out.println("Returning money snack was not found.");
        }
    }
}
