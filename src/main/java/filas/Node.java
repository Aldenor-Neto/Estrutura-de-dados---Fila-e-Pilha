package filas;

public class Node {

    public char  data;
    public Node next;
    public Node prev;

    public Node(){}

    public Node(char value) {
        this.data = value;
    }

// getters e setters

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
