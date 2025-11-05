package Fila;

public class Fila {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila() {
        elementos = new int[5];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enfileirar(int valor) {
        if (tamanho < elementos.length) {
            elementos[fim] = valor;
            fim = (fim + 1) % elementos.length; // move circularmente
            tamanho++;
            System.out.println("Valor " + valor + " enfileirado.");
        } else {
            System.out.println("Fila cheia! Não é possível enfileirar mais elementos.");
        }
    }

    public void desenfileirar() {
        if (tamanho > 0) {
            int valorRemovido = elementos[inicio];
            inicio = (inicio + 1) % elementos.length;
            tamanho--;
            System.out.println("Valor " + valorRemovido + " desenfileirado.");
        } else {
            System.out.println("Fila vazia! Nada a desenfileirar.");
        }
    }

    public void mostrar() { //Solicitado no exercicio 4
        if (tamanho == 0) {
            System.out.println("Fila vazia.");
        } else {
            System.out.print("Fila atual: ");
            for (int i = 0; i < tamanho; i++) {
                int indice = (inicio + i) % elementos.length;
                System.out.print(elementos[indice] + " ");
            }
            System.out.println();
        }
    }
}
