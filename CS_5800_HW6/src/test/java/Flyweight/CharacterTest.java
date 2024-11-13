/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Flyweight;

import Flyweight.Properties;
import Flyweight.Character;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
    
    public CharacterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getStringText method, of class Character.
     */
    @Test
    public void testGetStringText() {
        System.out.println("getStringText");
        Properties propertiesInstance = new Properties("CheckFont", "CheckColor", 2);
        Character characterInstance = new Character("CheckText" , propertiesInstance);
        String expResult = "CheckText";
        String result = characterInstance.getStringText();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProperties method, of class Character.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        Properties propertiesInstance = new Properties("CheckFont", "CheckColor", 2);
        Character characterInstance = new Character("CheckText" , propertiesInstance);
        String expResultFont = "CheckFont";
        String expResultColor = "CheckColor";
        int expResultSize = 2;
        String resultFont = characterInstance.getProperties().getFont();
        String resultColor = characterInstance.getProperties().getColor();
        int resultSize = characterInstance.getProperties().getSize();
        assertEquals(expResultFont, resultFont);
        assertEquals(expResultColor, resultColor);
        assertEquals(expResultSize, resultSize);
    }

    /**
     * Test of toString method, of class Character.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Properties propertiesInstance = new Properties("CheckFont", "CheckColor", 2);
        Character characterInstance = new Character("CheckText" , propertiesInstance);
        String expResult = "Text: 'CheckText' (Font: CheckFont, Color: CheckColor, Size: 2)";
        String result = characterInstance.toString();
        assertEquals(expResult, result);
    }
    
}
