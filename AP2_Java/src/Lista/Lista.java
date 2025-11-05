package Lista;

public class Lista {
    private int[] elementos;
    private int tamanho;

    // Construtor
    public Lista() {
        elementos = new int[5];
        tamanho = 0;
    }

    // Método para inserir um novo valor na lista
    public void inserir(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
            System.out.println("Valor " + valor + " inserido na posição " + (tamanho - 1));
        } else {
            System.out.println("Lista.Lista cheia! Não é possível inserir mais elementos.");
        }
    }

    // Solicitado no exercicio 4
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.print("Elementos da lista: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}
