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

public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ChatServer server = new ChatServer();
        User instance = new User("Jalen", server);
        String expResult = "Jalen";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of sendMessage method, of class User.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        ChatServer server = new ChatServer();
        User instance = new User("Jalen", server);
        User user2 = new User("Bob", server);
        String recipient = instance.getName();
        String content = user2.getName();
        instance.sendMessage(recipient, content);
    }

    /**
     * Test of receiveMessage method, of class User.
     */
    @Test
    public void testReceiveMessage() {
        System.out.println("receiveMessage");
        ChatServer server = new ChatServer();
        User instance = new User("Jalen", server);
        User user2 = new User("Bob", server);
        String recipient = instance.getName();
        String content = user2.getName();
        Message message = new Message("Jalen", "Bob", "Hello");
        instance.receiveMessage(message);
    }

    /**
     * Test of undoLastMessage method, of class User.
     */
    @Test
    public void testUndoLastMessage() {
        System.out.println("undoLastMessage");
        ChatServer server = new ChatServer();
        User instance = new User("Jalen", server);
        User user2 = new User("Bob", server);
        instance.sendMessage("Bob", "Hello Bob!");
        instance.undoLastMessage();
    }

    /**
     * Test of blockUser method, of class User.
     */
    @Test
    public void testBlockUser() {
        System.out.println("blockUser");
        ChatServer server = new ChatServer();
        User instance = new User("Jalen", server);
        User user2 = new User("Bob", server);
        String recipient = instance.getName();
        String content = user2.getName();
        instance.blockUser("Bob");
    }

    /**
     * Test of iterator method, of class User.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        ChatServer server = new ChatServer();
        User instance = new User("Jalen", server);
        User userToSearchWith = new User("Bob", server);
        Iterator<Message> expResult = instance.iterator(userToSearchWith);
        Iterator<Message> result = instance.iterator(userToSearchWith);
        assertEquals(expResult.getClass(), result.getClass());
    }
    
}
