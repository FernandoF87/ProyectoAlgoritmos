

/**
 *
 * @author Fernando Flores Moya
 */
public class Queue {
    
    private Node first;
    private Node last;
    
    public Queue() {
        
    }
    
    public boolean empty() {
        return first == null;
    }

    public String first() throws EmptyQueueException {
        if (first != null) {
            return first.getData();
        }
        throw new EmptyQueueException("La cola está vacía");
    }

    public String dequeue() throws EmptyQueueException {
        if (first == null) {
            throw new EmptyQueueException("La cola está vacía");
        }
        String data = first.getData();
        first = first.getNext();
        if (first == null) {
            last = null;
        }
        return data;

    }

    public void enqueue(String data) {
        Node temp = new Node(data);
        if (first == null) {
            first = last = temp;
        } else {
            last.setNext(temp);
            last = temp;
        }
    }

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
    
    public String printAll() {
        String data = "";
        for (Node current = first; current != null; current = current.getNext()) {
            data += current.getData() + " ";
        }
        return data;
    }
    
    public Queue copy() {
        Queue copy = new Queue();
        for (Node current = first; current != null; current = current.getNext()) {
            copy.enqueue(current.getData());
        }
        return copy;
    }
}
