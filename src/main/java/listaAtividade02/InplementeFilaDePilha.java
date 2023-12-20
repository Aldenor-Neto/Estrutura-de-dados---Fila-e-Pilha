package listaAtividade02;

import pilhas.Pilha;

public class InplementeFilaDePilha {

    private Pilha pilha;
    private int size = 0;

    public void addTail(int value) {
        pilha.push(value);
        this.size++;
    }

    public void removeHead() {
        pilha.invertePilha();
        pilha.pop();
        pilha.invertePilha();
        this.size--;
    }

    public Pilha getPilha() {
        return pilha;
    }

    public void setPilha(Pilha pilha) {
        this.pilha = pilha;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
