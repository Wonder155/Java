package Pilha;

public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha() {
        elementos = new int[5];
        topo = -1;
    }

    public void empilhar(int valor) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = valor;
            System.out.println("Valor " + valor + " empilhado.");
        } else {
            System.out.println("Pilha cheia! Não é possível empilhar mais elementos.");
        }
    }

    public void desempilhar() {
        if (topo >= 0) {
            int valorRemovido = elementos[topo];
            topo--;
            System.out.println("Valor " + valorRemovido + " desempilhado.");
        } else {
            System.out.println("Pilha vazia! Nada a desempilhar.");
        }
    }

    public void mostrar() { //Solicitado no exercicio 4
        if (topo == -1) {
            System.out.println("Pilha vazia.");
        } else {
            System.out.print("Pilha atual: ");
            for (int i = topo; i >= 0; i--) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}
