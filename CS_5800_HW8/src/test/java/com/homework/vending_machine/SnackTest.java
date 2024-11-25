/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.homework.vending_machine;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SnackTest {
    
    public SnackTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Snack.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Snack instance = new Snack("Coke", 1.5, 5);
        String expResult = "Coke";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Snack.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Snack instance = new Snack("Coke", 1.5, 5);
        double expResult = 1.5;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getQuantity method, of class Snack.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Snack instance = new Snack("Coke", 1.5, 5);
        int expResult = 5;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of quantityDecrement method, of class Snack.
     */
    @Test
    public void testQuantityDecrement() {
        System.out.println("quantityDecrement");
        Snack instance = new Snack("Coke", 1.5, 5);
        instance.quantityDecrement();
        int result = instance.getQuantity();
        int expResult = 4;
        assertEquals(expResult, result);
    }

    /**
     * Test of availability method, of class Snack.
     */
    @Test
    public void testAvailability() {
        System.out.println("availability");
        Snack instance = new Snack("Coke", 1.5, 5);
        boolean expResult = true;
        boolean result = instance.availability();
        assertEquals(expResult, result);
    }
    
}
