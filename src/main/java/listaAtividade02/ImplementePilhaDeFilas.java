package listaAtividade02;

import filas.Fila;

public class ImplementePilhaDeFilas {

    private Fila fila1;
    private Fila fila2;
    private int size = 0;

    public void peep() {
        if (fila1.getHead() == null) {
            System.out.println("a pilha está vazia");
        } else {
            while (fila1.size > 1) {
                fila2.addTail(fila1.getHead().getData());
                fila1.removeFirst();
            }
            System.out.println(fila1.getHead().getData());
            fila2.addTail(fila1.getHead().getData());
            fila1.removeFirst();
            while (fila2.getHead() != null) {
                fila1.addTail(fila2.getHead().getData());
                fila2.removeFirst();
            }
        }
    }

    public void pop() {
        if (fila1.getHead() == null) {
            System.out.println("a pilha está vazia");
        } else {
            while (fila1.size > 1) {
                fila2.addTail(fila1.getHead().getData());
                fila1.removeFirst();
            }
            fila1.removeFirst();
            while (fila2.getHead() != null) {
                fila1.addTail(fila2.getHead().getData());
                fila2.removeFirst();
            }
            this.size--;
        }
    }

    public void push(int value) {
        fila1.addTail(value);
        this.size++;
    }
}
