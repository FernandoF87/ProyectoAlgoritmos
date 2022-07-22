/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Node for stack and queue that contains a string
 * 
 * @version
 * @author Jostin Castro
 */
public class Node {
    
    private String data;
    private Node next;
    
    public Node(String data) {
        this.data = data;
    }

    // Setters and getters
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}