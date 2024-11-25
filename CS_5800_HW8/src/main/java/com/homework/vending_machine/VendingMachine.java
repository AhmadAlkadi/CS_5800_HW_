/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.vending_machine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, Snack> snacks = new HashMap<>();
    private double insertMoney;
    private String snackSelected;
    private StateOfVendingMachine idleState = new Idle(this);
    private StateOfVendingMachine waitingForMoneyState = new WaitingForMoney(this);
    private StateOfVendingMachine dispensingSnackState = new DispensingSnack(this);
    private StateOfVendingMachine stateOfCurrent;
    private SnackDispenseHandler snackChain;
    
    public VendingMachine(){
        stateOfCurrent = idleState;
    }
    
    public void addSnack(Snack snack){
        snacks.put(snack.getName(), snack);
    }
    
    public void setChainOfSnack(){
        SnackDispenseHandler previousHandler = null;
        for (String snackName : snacks.keySet()) {
            SnackDispenseHandler currentHandler = new SnackHandler(snackName);
            if (previousHandler != null) {
                previousHandler.setNextHandler(currentHandler);
            } else {
                snackChain = currentHandler;
            }
            previousHandler = currentHandler;
        }
    }
    
    public void selectSnack(String nameOfSnack){
        stateOfCurrent.selectSnack(nameOfSnack);
    }
    
    public void insertMoney(double amount){
        stateOfCurrent.insertMoney(amount);
    }
    
    public void dispenseSnack(){
        stateOfCurrent.dispenseSnack();
    }
    
    public Snack getSnackByName(String name){
        return snacks.get(name);
    }
    
    public double getPriceOfselectedSnack(){
        Snack snack = getSnackByName(snackSelected);
        return (snack != null) ? snack.getPrice() : 0;
    }
    
    public String getSelectedSnackName(){
        return snackSelected;
    }
    
    public void setSelectSnack(String snackSelected){
        this.snackSelected = snackSelected;
    }
    
    public void setInsertMoney(double insertMoney){
        this.insertMoney = insertMoney;
    }
    
    public StateOfVendingMachine getIdleState() {
        return idleState;
    }

    public StateOfVendingMachine getWaitingForMoneyState() {
        return waitingForMoneyState;
    }

    public StateOfVendingMachine getDispensingSnackState() {
        return dispensingSnackState;
    }
    
    public void setCurrentState(StateOfVendingMachine stateOfCurrent){
        this.stateOfCurrent = stateOfCurrent;
    }
}
