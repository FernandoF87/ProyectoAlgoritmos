

/**
 * Class that represents a queue of strings
 * 
 * @author Fernando Flores Moya
 */
public class Queue {
    
    private Node first;
    private Node last;
    private int size;
    
    public Queue() {
        
    }
    
    /**
     * Determines if the queue is empty
     * 
     * @return a boolean representing if the queue is empty
     */
    public boolean empty() {
        return first == null;
    }

    /**
     * Returns the first string in the queue without removing it
     * 
     * @return the first string in the queue
     * @throws EmptyQueueException 
     */
    public String first() throws EmptyQueueException {
        if (first != null) {
            return first.getData();
        }
        throw new EmptyQueueException("La cola está vacía");
    }

    /**
     * Returns and removes the first string in the queue
     * 
     * @return the removed string
     * @throws EmptyQueueException 
     */
    public String dequeue() throws EmptyQueueException {
        if (first == null) {
            throw new EmptyQueueException("La cola está vacía");
        }
        String data = first.getData();
        first = first.getNext();
        if (first == null) {
            last = null;
        }
        size--;
        return data;

    }

    /**
     * Inserts a string at the end of the queue
     * 
     * @param data a string to be inserted
     */
    public void enqueue(String data) {
        Node temp = new Node(data);
        if (first == null) {
            first = last = temp;
        } else {
            last.setNext(temp);
            last = temp;
        }
        size++;
    }

    /**
     * Searches the queue for a specific string
     * 
     * @param data a string to find
     * @return the position where the string is found
     */
    public int search(String data) {
        int index = 1;
        for (Node current = first; current != null; current = current.getNext()) {
            if (current.getData().equals(data)) {
                return index;
            }
            index++;
        }
        return -1;
    }
    
    /**
     * Determines the number of elements in the queue
     * 
     * @return the number of elements in the queue
     */
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String data = "[";
        for (Node current = first; current != null; current = current.getNext()) {
            data += current.getData();
            if (current.getNext()!= null) {
                data += ", ";
            }
        }
        return data + "]";
    }
    
    /**
     * Prints all of the string in the queue from first to last
     * 
     * @return a string with all of the strings
     */
    public String printAll() {
        String data = "";
        for (Node current = first; current != null; current = current.getNext()) {
            data += current.getData() + " ";
        }
        return data;
    }
    
    /**
     * Makes a new queue with the same elements as the current queue
     * 
     * @return a queue with the same values
     */
    public Queue copy() {
        Queue copy = new Queue();
        for (Node current = first; current != null; current = current.getNext()) {
            copy.enqueue(current.getData());
        }
        return copy;
    }
}
