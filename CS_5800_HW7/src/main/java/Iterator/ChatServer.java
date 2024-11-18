/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ChatServer {
    private Map<String, User> users = new HashMap<>();
    private Map<String, Set<String>> blockList = new HashMap<>();

    public void registerUser(User user) {
        users.put(user.getName(), user);
        blockList.put(user.getName(), new HashSet<>());
    }

    public void unregisterUser(User user) {
        users.remove(user.getName());
        blockList.remove(user.getName());
    }

    public void sendMessage(Message message) {
        String sender = message.getSender();
        String recipient = message.getRecipient();

        if (blockList.get(recipient).contains(sender)) {
            System.out.println("Message blocked from " + sender + " to " + recipient);
            return;
        }

        User recipientUser = users.get(recipient);
        if (recipientUser != null) {
            recipientUser.receiveMessage(message);
        }
    }

    public void blockUser(String user, String blockedUser) {
        if (blockList.containsKey(user)) {
            blockList.get(user).add(blockedUser);
        }
    }
}
