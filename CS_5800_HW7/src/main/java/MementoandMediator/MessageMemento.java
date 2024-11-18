/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MementoandMediator;
import java.util.Date;
import java.util.Stack;

public class MessageMemento {
    private String content;
    private Date timestamp;

    public MessageMemento(String content, Date timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}

class ChatHistory {
    private Stack<Message> history = new Stack<>();

    public void addMessage(Message message) {
        history.push(message);
    }

    public Message getLastMessage() {
        return history.isEmpty() ? null : history.pop();
    }
}
