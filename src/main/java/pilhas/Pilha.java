package pilhas;

import filas.Fila;

public class Pilha {

    public Node head = null;
    public int size = 0;

    public void invertePilha(){
        Fila fila = new Fila();
        if(getHead() == null){
            System.out.println("Pilha vazia");
            return;
        }

        while(getHead() != null){
           fila.addTail(getHead().getElemento());
           pop();
        }

        while(fila.getHead() != null){
            push(fila.getHead().getData());
            pop();
        }
    }

    public void limpaPilha(Pilha pilha) {
        if (pilha.getHead() == null) {
            System.out.println("A pilha está vazia");
            return;
        }
        pilha.setHead(pilha.getHead().getNext());
        limpaPilha(pilha);
    }

    public void pop() {
        if (getHead() == null) {
            System.out.println("A pilha está vazia");
            return;
        }

        setHead(getHead().getNext());
        this.size--;
    }

    public void peep() {
        if (getHead() == null) {
            System.out.println("A pilha está vazia");
            return;
        }

        System.out.println(getHead().getElemento());
    }

    public void push(char  elemento) {
        Node newNode = new Node(elemento);
        newNode.setNext(head);
        setHead(newNode);
        this.size++;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


}
