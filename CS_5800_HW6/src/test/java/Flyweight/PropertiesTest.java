/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Flyweight;

import Flyweight.Properties;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PropertiesTest {
    
    public PropertiesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getFont method, of class Properties.
     */
    @Test
    public void testGetFont() {
        System.out.println("getFont");
        Properties instance = new Properties("CheckFont", "CheckColor", 2);
        String expResult = "CheckFont";
        String result = instance.getFont();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColor method, of class Properties.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Properties instance = new Properties("CheckFont", "CheckColor", 2);
        String expResult = "CheckColor";
        String result = instance.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSize method, of class Properties.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Properties instance = new Properties("CheckFont", "CheckColor", 2);
        int expResult = 2;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Properties.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Properties instance = new Properties("CheckFont", "CheckColor", 2);
        String expResult = "Font: CheckFont, Color: CheckColor, Size: 2";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
