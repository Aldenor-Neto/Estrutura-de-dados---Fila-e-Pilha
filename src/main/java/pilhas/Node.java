package pilhas;

public class Node {

    public char elemento;
    public Node next;

    Node(char elemento) {
        this.elemento = elemento;
    }

    public char getElemento() {
        return elemento;
    }

    public void setElemento(char elemento) {
        this.elemento = elemento;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
