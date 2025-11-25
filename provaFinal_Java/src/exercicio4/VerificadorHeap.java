package exercicio4;

public class VerificadorHeap {

    public static void main(String[] args) {
        int[] valido = {1, 3, 5, 4, 6, 10};
        int[] invalido = {5, 3, 8};

        System.out.println("Array 1 é MinHeap? " + isMinHeap(valido));   // true
        System.out.println("Array 2 é MinHeap? " + isMinHeap(invalido)); // false
    }

    public static boolean isMinHeap(int[] arr) {
        int n = arr.length;
        // Verifica cada nó pai
        for (int i = 0; i <= (n / 2) - 1; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // Se filho esquerdo existe e é menor que o pai -> Falha
            if (left < n && arr[left] < arr[i]) {
                return false;
            }

            // Se filho direito existe e é menor que o pai -> Falha
            if (right < n && arr[right] < arr[i]) {
                return false;
            }
        }
        return true;
    }
}