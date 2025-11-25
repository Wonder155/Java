package exercicio3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DualPriorityQueue {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    private Map<Integer, Integer> deletedCounts; // Mapa para Lazy Deletion
    private int totalElements;

    public DualPriorityQueue() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        deletedCounts = new HashMap<>();
        totalElements = 0;
    }

    public void insert(int value) {
        minHeap.add(value);
        maxHeap.add(value);
        totalElements++;
    }

    public int getMax() {
        prune(maxHeap);
        if (maxHeap.isEmpty()) throw new IllegalStateException("Fila vazia");
        return maxHeap.peek();
    }

    public int getMin() {
        prune(minHeap);
        if (minHeap.isEmpty()) throw new IllegalStateException("Fila vazia");
        return minHeap.peek();
    }

    public int removeMax() {
        prune(maxHeap);
        if (maxHeap.isEmpty()) throw new IllegalStateException("Fila vazia");
        int max = maxHeap.poll();
        // Marca como deletado para o minHeap ignorar quando encontrar
        deletedCounts.put(max, deletedCounts.getOrDefault(max, 0) + 1);
        totalElements--;
        return max;
    }

    public int removeMin() {
        prune(minHeap);
        if (minHeap.isEmpty()) throw new IllegalStateException("Fila vazia");
        int min = minHeap.poll();
        // Marca como deletado para o maxHeap ignorar quando encontrar
        deletedCounts.put(min, deletedCounts.getOrDefault(min, 0) + 1);
        totalElements--;
        return min;
    }

    // Remove elementos que já foram "deletados logicamente" do topo
    private void prune(PriorityQueue<Integer> heap) {
        while (!heap.isEmpty() && deletedCounts.getOrDefault(heap.peek(), 0) > 0) {
            int val = heap.poll();
            deletedCounts.put(val, deletedCounts.get(val) - 1);
        }
    }

    public static void main(String[] args) {
        DualPriorityQueue dpq = new DualPriorityQueue();
        dpq.insert(10);
        dpq.insert(20);
        dpq.insert(5);

        System.out.println("Removeu Max: " + dpq.removeMax()); // 20
        System.out.println("Removeu Min: " + dpq.removeMin()); // 5
        System.out.println("Novo Max: " + dpq.getMax());       // 10
    }
}