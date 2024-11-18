/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Iterator;

import java.util.Date;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest {
    
    public MessageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getSender method, of class Message.
     */
    @Test
    public void testGetSender() {
        System.out.println("getSender");
        Message instance = new Message("Jalen", "Bob", "Hello");
        String expResult = "Jalen";
        String result = instance.getSender();
    }

    /**
     * Test of getRecipient method, of class Message.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        Message instance = new Message("Jalen", "Bob", "Hello");
        String expResult = "Bob";
        String result = instance.getRecipient();
        assertEquals(expResult, result);
    }

    /**
     * Test of getContent method, of class Message.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        Message instance = new Message("Jalen", "Bob", "Hello");
        String expResult = "Hello";
        String result = instance.getContent();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimestamp method, of class Message.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        Message instance = new Message("Jalen", "Bob", "Hello");
        Date expResult = instance.getTimestamp();
        Date result = instance.getTimestamp();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Message.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Message instance = new Message("Jalen", "Bob", "Hello");
        String expResult = "[" + instance.getTimestamp() + "] Jalen -> Bob: Hello";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
