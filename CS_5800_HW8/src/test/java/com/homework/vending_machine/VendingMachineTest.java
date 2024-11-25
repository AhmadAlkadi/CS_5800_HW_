/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.homework.vending_machine;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {
    
    public VendingMachineTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of addSnack method, of class VendingMachine.
     */
    @Test
    public void testAddSnack() {
        System.out.println("addSnack");
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
    }

    /**
     * Test of setChainOfSnack method, of class VendingMachine.
     */
    @Test
    public void testSetChainOfSnack() {
        System.out.println("setChainOfSnack");
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
        instance.setChainOfSnack();
    }

    /**
     * Test of selectSnack method, of class VendingMachine.
     */
    @Test
    public void testSelectSnack() {
        System.out.println("selectSnack");
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
        String nameOfSnack = "Coke";
        instance.selectSnack(nameOfSnack);
    }

    /**
     * Test of insertMoney method, of class VendingMachine.
     */
    @Test
    public void testInsertMoney() {
        System.out.println("insertMoney");
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
        double amount = 2;
        instance.insertMoney(amount);
    }

    /**
     * Test of dispenseSnack method, of class VendingMachine.
     */
    @Test
    public void testDispenseSnack() {
        System.out.println("dispenseSnack");
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
        instance.dispenseSnack();
    }

    /**
     * Test of getSnackByName method, of class VendingMachine.
     */
    @Test
    public void testGetSnackByName() {
        System.out.println("getSnackByName");
        String name = "Coke";
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
        Snack expResult = new Snack("Coke", 1.5, 5);
        Snack result = instance.getSnackByName(name);
        assertEquals(expResult.getName(), result.getName());
    }

    /**
     * Test of getPriceOfselectedSnack method, of class VendingMachine.
     */
    @Test
    public void testGetPriceOfselectedSnack() {
        System.out.println("getPriceOfselectedSnack");
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
        double expResult = 1.5;
        double result = snack.getPrice();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getSelectedSnackName method, of class VendingMachine.
     */
    @Test
    public void testGetSelectedSnackName() {
        System.out.println("getSelectedSnackName");
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
        String expResult = "Coke";
        String result = snack.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSelectSnack method, of class VendingMachine.
     */
    @Test
    public void testSetSelectSnack() {
        System.out.println("setSelectSnack");
        String snackSelected = "Coke";
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
        instance.setSelectSnack(snackSelected);
    }

    /**
     * Test of setInsertMoney method, of class VendingMachine.
     */
    @Test
    public void testSetInsertMoney() {
        System.out.println("setInsertMoney");
        double insertMoney = 1.5;
        Snack snack = new Snack("Coke", 1.5, 5);
        VendingMachine instance = new VendingMachine();
        instance.addSnack(snack);
        instance.setInsertMoney(insertMoney);
    }

    /**
     * Test of getIdleState method, of class VendingMachine.
     */
    @Test
    public void testGetIdleState() {
        System.out.println("getIdleState");
        VendingMachine instance = new VendingMachine();
        StateOfVendingMachine result = instance.getIdleState();
    }

    /**
     * Test of getWaitingForMoneyState method, of class VendingMachine.
     */
    @Test
    public void testGetWaitingForMoneyState() {
        System.out.println("getWaitingForMoneyState");
        VendingMachine instance = new VendingMachine();
        StateOfVendingMachine result = instance.getWaitingForMoneyState();
    }

    /**
     * Test of getDispensingSnackState method, of class VendingMachine.
     */
    @Test
    public void testGetDispensingSnackState() {
        System.out.println("getDispensingSnackState");
        VendingMachine instance = new VendingMachine();
        StateOfVendingMachine result = instance.getDispensingSnackState();
    }

    /**
     * Test of setCurrentState method, of class VendingMachine.
     */
    @Test
    public void testSetCurrentState() {
        System.out.println("setCurrentState");
        StateOfVendingMachine stateOfCurrent = null;
        VendingMachine instance = new VendingMachine();
        instance.setCurrentState(stateOfCurrent);
    }
    
}
