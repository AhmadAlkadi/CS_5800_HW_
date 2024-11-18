/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MementoandMediator;

public class User {
    private String name;
    private ChatServer server;
    private ChatHistory history = new ChatHistory();

    public User(String name, ChatServer server) {
        this.name = name;
        this.server = server;
        server.registerUser(this);
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String recipient, String content) {
        Message message = new Message(name, recipient, content);
        history.addMessage(message);
        server.sendMessage(message);
    }

    public void receiveMessage(Message message) {
        System.out.println(name + " received: " + message);
    }

    public void undoLastMessage() {
        Message lastMessage = history.getLastMessage();
        if (lastMessage != null) {
            System.out.println(name + " undid message: " + lastMessage);
        } else {
            System.out.println(name + " has no messages to undo.");
        }
    }

    public void blockUser(String userToBlock) {
        server.blockUser(name, userToBlock);
        System.out.println(name + " blocked " + userToBlock);
    }
}
