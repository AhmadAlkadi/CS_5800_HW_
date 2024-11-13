/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Flyweight;

import Flyweight.Document;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {
    
    public DocumentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of addCharacter method, of class Document.
     */
    @Test
    public void testAddCharacter() {
        System.out.println("addCharacter");
        String stringText = "TestText";
        String font = "TestFont";
        String color = "TestColor";
        int size = 2;
        Document instance = new Document();
        instance.addCharacter(stringText, font, color, size);
    }

    /**
     * Test of saveToFile method, of class Document.
     */
    @Test
    public void testSaveToFile() {
        System.out.println("saveToFile");
        String filename = "";
        Document instance = new Document();
        instance.saveToFile(filename);
    }

    /**
     * Test of loadFromFile method, of class Document.
     */
    @Test
    public void testLoadFromFile() {
        System.out.println("loadFromFile");
        String filename = "";
        Document instance = new Document();
        instance.loadFromFile(filename);
    }

    /**
     * Test of toString method, of class Document.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Document instance = new Document();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
