package filas;

import pilhas.Pilha;

public class Fila {

    public Node head;
    public Node tail;
    public int size = 0;

    public void inverteKElementos(int k) {
        if (getHead() == null) {
            System.out.println("Fila vazia");
            return;
        }

        Pilha pilha = new Pilha();
        int cont = 1;

        while (cont <= k) {
            pilha.push(getHead().getData());
            removeFirst();
            cont++;
        }

        while (pilha.getHead() != null) {
            addTail(pilha.getHead().getElemento());
            pilha.pop();
        }
        cont = 1;
        while (cont <= (size - k)) {
            char  aux = getHead().getData();
            removeFirst();
            addTail(aux);
            cont++;
        }
    }

    public void inverteFila() {
        Pilha pilha = new Pilha();
        if (getHead() == null) {
            System.out.println("fila vazia");
            return;
        }

        while (getHead() != null) {
            pilha.push(getHead().getData());
            removeFirst();
        }

        while (pilha.getHead() != null) {
            addTail(pilha.getHead().getElemento());
            pilha.pop();
        }
    }

    public void removeFirst() {
        if (getHead() == null) {
            System.out.println("Fila vazia");
        } else {
            setHead(getHead().getNext());
            this.size--;
        }
    }

    public void addTail(char value) {
        Node newNode = new Node(value);
        if (getHead() == null) {
            setHead(newNode);
            setTail(newNode);
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            setTail(newNode);
        }
        this.size++;
    }

    public void printFirst() {
        System.out.println(getHead().getData());
    }

    public void printTail() {
        System.out.println(getTail().getData());
    }

    public void printFila() {
        if (getHead() == null) {
            System.out.println("Fila vazia");
        } else {
            Node current = getHead();
            while (current != null) {
                System.out.println(current.getData());
                current = current.getNext();
            }
        }
    }


// getters e setters

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
