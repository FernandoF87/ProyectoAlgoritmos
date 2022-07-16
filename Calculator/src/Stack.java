
import java.util.EmptyStackException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @version
 * @author Jostin Castro
 */
public class Stack {
    
    private Node top;
    private int countElements;
    private int maxElements;
    
    public Stack() {
        top = null;
    }
    
    public Stack(int size) {
        if (size >= 1) {
            maxElements = size;
        }
    }
    
    public boolean empty() {
        return (top == null);
    }
    
    public String push(String element) throws StackOverflowError {
        if ((maxElements != 0) && (countElements == maxElements)) {
            throw new StackOverflowError();
        }
        
        Node newNode = new Node(element);
        newNode.setNext(top);
        top = newNode;
        countElements++;
        return top.getData();
    }
    
    public String pop() throws EmptyStackException {
        if (top == null) {
            throw new EmptyStackException();
        }
        String temp = top.getData();
        top = top.getNext();
        countElements--;
        return temp;
        
    }
    
    public String peek() throws EmptyStackException {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getData();
    }
    
    public int search(String data) {
        if (top == null) {
            return -1;
        }
        
        Node actual = top;
        int count = 0;
        while (actual != null) {
            count++;
            if (actual.getData().equals(data)) {
                return count;
            }
            actual = actual.getNext();
        }
        return -1;
    }
    
    public int size() {
        return countElements;
    }

    //Temporal method:
    public String printAllData() {
        Node actual = top;
        String text = "";
        while (actual != null) {
            text += actual.getData() + " --> ";
            actual = actual.getNext();
        }
        return text;
    }
}
