/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.vending_machine;

abstract class SnackDispenseHandler {
    protected SnackDispenseHandler nextHandler;
    
    public void setNextHandler(SnackDispenseHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    
    public abstract void handleRequest(String snackName, VendingMachine vendingMachine);
}
