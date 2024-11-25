/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.vending_machine;

public class SnackHandler extends SnackDispenseHandler {
    private String nameOfSnack;

    public SnackHandler(String snackName) {
        this.nameOfSnack = snackName;
    }

    @Override
    public void handleRequest(String snackName, VendingMachine vendingMachine) {
        if (this.nameOfSnack.equals(snackName)) {
            vendingMachine.dispenseSnack();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(snackName, vendingMachine);
        } else {
            System.out.println("Snack was not found in the vending machine.");
        }
    }
}
