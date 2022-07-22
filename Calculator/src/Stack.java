
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
    
    /**
     * Creates a stack without limit of elements.
     */
    public Stack() {
        top = null;
    }
    /**
     * Create a stack with limit of elements.
     * @param size the max size of the stack.
     */
    public Stack(int size) {
        if (size >= 1) {
            maxElements = size;
        }
    }
    
    /**
     * Method that permits know if the stack has elements.
     * @return <b>true</b> if the stack is empty, <b>false</b> otherwise. 
     */
    public boolean empty() {
        return (top == null);
    }
    
    /**
     * Push a element into the stack.
     * @param element the element to push.
     * @return the element pushed.
     * @throws StackOverflowError if the stack has the limit of elements (if defined).
     */
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
    
    /**
     * Method to obtain and eliminate of the stack the element on the top
     * of the stack.
     * @return the element on the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public String pop() throws EmptyStackException {
        if (top == null) {
            throw new EmptyStackException();
        }
        String temp = top.getData();
        top = top.getNext();
        countElements--;
        return temp;
        
    }
    
    /**
     * Method that permit obtain the element on the top of the stack without eliminate
     * it from the stack.
     * @return the element on the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public String peek() throws EmptyStackException {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.getData();
    }
    
    /**
     * Method that permit search an element on the stack, and know it position.
     * @param data the element to search.
     * @return the position on the stack of the element, -1 if not founded.
     */
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
    
    /**
     * Method that permit know the size of the stack.
     * @return the size of the stack.
     */
    public int size() {
        return countElements;
    }

    /**
     * Method used to obtain an string with all the elements on the stack.
     * @return a String with the elements on the stack.
     */
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
