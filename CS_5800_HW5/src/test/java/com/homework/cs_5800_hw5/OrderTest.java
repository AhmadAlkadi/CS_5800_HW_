/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.homework.cs_5800_hw5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PROXD
 */
public class OrderTest {
    
    public OrderTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    @org.junit.jupiter.api.Test
    public void testAddItem() {
        CutomerOrderItem burger = new Burger();
        Order order = new Order();
        order.addItem(burger);
        
        assertEquals("Burger", burger.getDescription());
    }

    @org.junit.jupiter.api.Test
    public void testCalculateTotalCost() {
        CutomerOrderItem burger = new Burger();
        CutomerOrderItem cheeseBurger = new Cheese(new Burger());
        CutomerOrderItem baconCheeseBurger = new Bacon(new Cheese(new Burger()));
        
        Order order = new Order();
        order.addItem(burger);
        order.addItem(cheeseBurger);
        order.addItem(baconCheeseBurger);
        
        assertEquals(29.0, order.calculateTotalCost());
    }
    
}
