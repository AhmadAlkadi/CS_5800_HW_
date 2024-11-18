/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatHistory implements IterableByUser {
    private List<Message> history = new ArrayList<>();

    public void addMessage(Message message) {
        history.add(message);
    }

    public Message getLastMessage() {
        return history.isEmpty() ? null : history.remove(history.size() - 1);
    }

    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return new SearchMessagesByUser(userToSearchWith, history);
    }
}
