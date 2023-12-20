package filas;

import pilhas.Pilha;

public class Deque {

    public Node head;
    public Node tail;
    public int size = 0;

    public void criaDequeDeDuasPilhas(Pilha pilha1, Pilha pilha2) {
        Pilha aux = pilha1;
        while (aux.getHead() != null) {
            addTail(aux.getHead().getElemento());
            aux.pop();
        }

        aux = pilha2;
        while (aux.getHead() != null) {
            addTail(aux.getHead().getElemento());
            aux.pop();
        }
    }

    public void criaDequeDeDuasFilas(Fila fila1, Fila fila2) {
        Node current = fila1.getHead();
        while (current != null) {
            addTail(current.getData());
            current = current.getNext();
            this.size++;
        }

        current = fila2.getHead();
        while (current != null) {
            addTail(current.getData());
            current = current.getNext();
            this.size++;
        }
    }

    public void addFirst(char value) {
        Node newNode = new Node(value);
        if (getHead() == null) {
            setHead(newNode);
            setTail(newNode);
        } else {
            newNode.setNext(getHead());
            head.setPrev(newNode);
            setHead(newNode);
        }
        this.size++;
    }

    public void removeFirst() {
        if (getHead() == null) {
            System.out.println("Deque  vazia");
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

    public void removeTail() {
        if (getTail() == null) {
            System.out.println("Deque vazio");
        } else {
            tail.prev.setNext(null);
            this.size--;
        }
    }

    public void printFirst() {
        if (getHead() == null) {
            System.out.println("Deque vazio");
        } else {
            System.out.println(getHead().getData());
        }
    }

    public void printTail() {
        if (getTail() == null) {
            System.out.println("Deque vazio");
        } else {
            System.out.println(getTail().getData());
        }
    }

    public void printDeque() {
        Node current = getHead();

        if (getHead() == null) {
            System.out.println("Deque vazio");
            return;
        }
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
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
