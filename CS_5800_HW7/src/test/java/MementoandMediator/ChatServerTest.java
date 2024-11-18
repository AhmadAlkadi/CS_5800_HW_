/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package MementoandMediator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChatServerTest {
    
    public ChatServerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of registerUser method, of class ChatServer.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        ChatServer instance = new ChatServer();
        User user = new User("Jalen", instance);
        instance.registerUser(user);
        assertEquals("Jalen", user.getName());
    }

    /**
     * Test of unregisterUser method, of class ChatServer.
     */
    @Test
    public void testUnregisterUser() {
        System.out.println("unregisterUser");
        ChatServer instance = new ChatServer();
        User user = new User("Jalen", instance);
        instance.registerUser(user);
        instance.unregisterUser(user);
    }

    /**
     * Test of sendMessage method, of class ChatServer.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        ChatServer instance = new ChatServer();
        User user1 = new User("Jalen", instance);
        User user2 = new User("Bob", instance);

        user1.sendMessage("Bob", "Hello Bob!");
    }

    /**
     * Test of blockUser method, of class ChatServer.
     */
    @Test
    public void testBlockUser() {
        System.out.println("blockUser");
        ChatServer instance = new ChatServer();
        User user1 = new User("Jalen", instance);
        User user2 = new User("Bob", instance);
        User user3 = new User("David", instance);

        user1.sendMessage("Bob", "Hello Bob!");
        user2.sendMessage("Jalen", "Hi Jalen!");

        user2.blockUser("Jalen");
        user1.sendMessage("Bob", "Bob, can you hear me?");
    }
    
}
