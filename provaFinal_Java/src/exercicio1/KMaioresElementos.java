package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KMaioresElementos {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("Os " + k + " maiores elementos são: " + findKthLargest(arr, k));
    }

    public static List<Integer> findKthLargest(int[] arr, int k) {
        // Min-Heap para manter apenas os K maiores
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
            // Se ultrapassar K elementos, removemos o menor (que não faz parte dos K maiores)
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return new ArrayList<>(minHeap);
    }
}