/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Iterator;

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
        ChatServer server = new ChatServer();
        User user = new User("Jalen", server);
        ChatServer instance = new ChatServer();
        instance.registerUser(user);
    }

    /**
     * Test of unregisterUser method, of class ChatServer.
     */
    @Test
    public void testUnregisterUser() {
        System.out.println("unregisterUser");
        ChatServer server = new ChatServer();
        User user = new User("Jalen", server);
        ChatServer instance = new ChatServer();
        instance.unregisterUser(user);
    }

    /**
     * Test of sendMessage method, of class ChatServer.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        ChatServer instance = new ChatServer();
        User user = new User("Jalen", instance);
        Message message = new Message("Jalen", "Jalen", "Hello");
        instance.sendMessage(message);
    }

    /**
     * Test of blockUser method, of class ChatServer.
     */
    @Test
    public void testBlockUser() {
        System.out.println("blockUser");
        ChatServer server = new ChatServer();
        User userCreate = new User("Jalen", server);
        String user = "Jalen";
        String blockedUser = "Jalen";
        ChatServer instance = new ChatServer();
        instance.blockUser(user, blockedUser);
    }
    
}
