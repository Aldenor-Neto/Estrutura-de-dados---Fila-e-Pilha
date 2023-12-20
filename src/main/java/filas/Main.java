package filas;

import pilhas.Pilha;

public class Main {

    public static boolean isPalindromo(String str) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        for (char i : str.toCharArray()) {
            fila.addTail(i);
            pilha.push(i);
        }

        while ((fila.getHead().getData() == pilha.getHead().getElemento()) | pilha.getHead() != null) {
            fila.removeFirst();
            pilha.pop();
        }

        if (pilha.getHead() == null) {
            return true;
        } else {
            return false;
        }
    }


    public static Fila criandoFilaDeDuasPilhas(Pilha pilha1, Pilha pilha2) {
        Fila fila = new Fila();

        while (pilha1.getHead() != null) {
            fila.addTail(pilha1.getHead().getElemento());
            pilha1.pop();
        }

        while (pilha2.getHead() != null) {
            fila.addTail(pilha2.getHead().getElemento());
            pilha2.pop();
        }

        return fila;
    }

    public static Fila transformaDequeEmFila(Deque deque) {
        Fila fila = new Fila();
        Node current = deque.getHead();

        if (current == null) {
            System.out.println("Deque vazio");
            return fila;
        }

        while (current != null) {
            fila.addTail(current.getData());
            current = current.getNext();
        }

        return fila;
    }

    public static void main(String[] args) {

        String str = "arara";
boolean verifica =         isPalindromo(str);
        System.out.println(verifica);
    }
}