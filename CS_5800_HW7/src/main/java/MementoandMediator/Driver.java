/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MementoandMediator;

public class Driver {
        public static void main(String[] args) {
        ChatServer server = new ChatServer();

        User user1 = new User("Jalen", server);
        User user2 = new User("Bob", server);
        User user3 = new User("David", server);

        user1.sendMessage("Bob", "Hello Bob!");
        user2.sendMessage("Jalen", "Hi Jalen!");
        user3.sendMessage("Jalen", "Hey Jalen, it's David.");

        user1.undoLastMessage();

        user2.blockUser("Jalen");
        user1.sendMessage("Bob", "Bob, can you hear me?");

        user3.sendMessage("Bob", "Hi Bob!");
    }
}
