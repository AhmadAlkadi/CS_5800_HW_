/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Flyweight;

import Flyweight.PropertiesFactory;
import Flyweight.Properties;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PropertiesFactoryTest {
    
    public PropertiesFactoryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getFlyweight method, of class PropertiesFactory.
     */
    @Test
    public void testGetFlyweight() {
        System.out.println("getFlyweight");
        String font = "CheckFont";
        String color = "CheckColor";
        int size = 2;
        Properties expResult = new Properties("CheckFont", "CheckColor", 2);
        Properties result = PropertiesFactory.getFlyweight(font, color, size);
        assertEquals(expResult.toString(), result.toString());
    }
    
}
