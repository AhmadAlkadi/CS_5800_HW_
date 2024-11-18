/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.List;
import java.util.Iterator; 
import java.util.NoSuchElementException;

public class SearchMessagesByUser implements Iterator<Message> {
    private User userToSearchWith;
    private List<Message> messages;
    private int currentIndex = 0;

    public SearchMessagesByUser(User userToSearchWith, List<Message> messages) {
        this.userToSearchWith = userToSearchWith;
        this.messages = messages;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < messages.size()) {
            Message message = messages.get(currentIndex);
            if (message.getSender().equals(userToSearchWith.getName()) ||
                message.getRecipient().equals(userToSearchWith.getName())) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Message next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return messages.get(currentIndex++);
    }
}
