/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchMessagesByUserTest {
    
    public SearchMessagesByUserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of hasNext method, of class SearchMessagesByUser.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        ChatServer server = new ChatServer();
        User alice = new User("Jalen", server);
        User bob = new User("Bob", server);
        List<Message> messagesList = new ArrayList();
        Message message = new Message("Jalen", "Bob", "Hello");
        messagesList.add(message);
        SearchMessagesByUser instance = new SearchMessagesByUser(alice, messagesList);
        boolean expResult = true;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
    }

    /**
     * Test of next method, of class SearchMessagesByUser.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        ChatServer server = new ChatServer();
        User alice = new User("Jalen", server);
        User bob = new User("Bob", server);
        List<Message> messagesList = new ArrayList();
        Message message = new Message("Jalen", "Bob", "Hello");
        messagesList.add(message);
        SearchMessagesByUser instance = new SearchMessagesByUser(alice, messagesList);
        Message result = instance.next();
        assertEquals(message, result);
    }
    
}
