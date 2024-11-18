/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package MementoandMediator;

import java.util.Date;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageMementoTest {
    
    public MessageMementoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getContent method, of class MessageMemento.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        Message helper = new Message("Jalen", "Bob", "Hello");
        Date getDate = helper.getTimestamp();
        MessageMemento instance = new MessageMemento("Test", getDate);
        String expResult = "Test";
        String result = instance.getContent();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimestamp method, of class MessageMemento.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        Message helper = new Message("Jalen", "Bob", "Hello");
        Date getDate = helper.getTimestamp();
        MessageMemento instance = new MessageMemento("Test", getDate);
        Date expResult = instance.getTimestamp();;
        Date result = instance.getTimestamp();
        assertEquals(expResult, result);
    }
    
}
