/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Iterator;

import java.util.Iterator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatHistoryTest {
    
    public ChatHistoryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of addMessage method, of class ChatHistory.
     */
    @Test
    public void testAddMessage() {
        System.out.println("addMessage");
        Message message = new Message("Jalen", "Bob", "Hello");
        ChatHistory instance = new ChatHistory();
        instance.addMessage(message);
    }

    /**
     * Test of getLastMessage method, of class ChatHistory.
     */
    @Test
    public void testGetLastMessage() {
        System.out.println("getLastMessage");
        ChatHistory instance = new ChatHistory();
        Message expResult = new Message("Jalen", "Bob", "Hello");
        instance.addMessage(expResult);
        Message result = instance.getLastMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of iterator method, of class ChatHistory.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        ChatServer server = new ChatServer();
        User userToSearchWith = new User("Jalen", server);
        ChatHistory instance = new ChatHistory();
        Iterator<Message> expResult = instance.iterator(userToSearchWith);
        Iterator<Message> result = instance.iterator(userToSearchWith);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
}
