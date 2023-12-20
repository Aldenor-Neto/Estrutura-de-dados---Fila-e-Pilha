package listaAtividade02;

import pilhas.Pilha;

public class ImplementeDequeDePilha {

    private Pilha pilha;
    private int size = 0;

    public void removeTail() {
        if (pilha.getHead() == null) {
            System.out.println("O deque já está vazio");
        } else {
            pilha.pop();
            this.size--;
        }
    }

    public void addTail(char value) {
        pilha.push(value);
        this.size++;
    }

    public void removeHead() {
        if (pilha.getHead() == null) {
            System.out.println("O deque já está vazio");
        } else {
            pilha.invertePilha();
            pilha.pop();
            pilha.invertePilha();
            this.size--;
        }

    }

    public void addHead(char value) {
        if (pilha.getHead() == null) {
            pilha.push(value);
            this.size++;
        } else {
            pilha.invertePilha();
            pilha.push(value);
            pilha.invertePilha();
            this.size++;
        }
    }

    public Pilha getPilha() {
        return pilha;
    }

    public void setPilha(Pilha pilha) {
        this.pilha = pilha;
    }

}
