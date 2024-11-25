/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.homework.vending_machine;

public class Driver {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addSnack(new Snack("Coke", 1.5, 5));
        vendingMachine.addSnack(new Snack("Pepsi", 1.5, 3));
        vendingMachine.addSnack(new Snack("Cheetos", 2.5, 10));
        vendingMachine.addSnack(new Snack("Doritos", 2.3, 7));
        vendingMachine.addSnack(new Snack("KitKat", 2.2, 8));
        vendingMachine.addSnack(new Snack("Snickers", 2, 1));

        vendingMachine.setChainOfSnack();
        
        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(4);
        vendingMachine.dispenseSnack();
        
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(6.54);
        vendingMachine.dispenseSnack();
        
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(4);
        vendingMachine.dispenseSnack();

        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();
        
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(2.3);
        vendingMachine.dispenseSnack();
    }
}
