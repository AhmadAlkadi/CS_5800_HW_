/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.Iterator;

public class Driver {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();

        User alice = new User("Jalen", server);
        User bob = new User("Bob", server);
        User charlie = new User("David", server);

        alice.sendMessage("Bob", "Hello Bob!");
        alice.sendMessage("David", "Hey David!");
        bob.sendMessage("Jalen", "Hi Jalen!");
        charlie.sendMessage("Jalen", "Hi Jalen, it's David!");

        // Iterate over Alice's messages by Bob
        System.out.println("Messages between Jalen and Bob:");
        Iterator<Message> iterator = alice.iterator(bob);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
