/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.homework.vending_machine;

public interface StateOfVendingMachine {
    void selectSnack(String name);
    void insertMoney(double amount);
    void dispenseSnack();
}
