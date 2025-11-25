package exercicio5;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    // Max-Heap para a metade inferior (guarda o maior dos pequenos)
    private PriorityQueue<Integer> lowerHalf;
    // Min-Heap para a metade superior (guarda o menor dos grandes)
    private PriorityQueue<Integer> upperHalf;

    public MedianFinder() {
        lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
        upperHalf = new PriorityQueue<>();
    }

    public void addNum(int num) {
        // Adiciona ao lowerHalf e move o maior dele para o upperHalf
        lowerHalf.add(num);
        upperHalf.add(lowerHalf.poll());

        // Balanceamento: lowerHalf pode ter no máximo 1 a mais que upperHalf
        if (lowerHalf.size() < upperHalf.size()) {
            lowerHalf.add(upperHalf.poll());
        }
    }

    public double findMedian() {
        if (lowerHalf.size() > upperHalf.size()) {
            return lowerHalf.peek();
        } else {
            return (lowerHalf.peek() + upperHalf.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        System.out.println("Mediana atual: " + mf.findMedian()); // 1.5
        mf.addNum(3);
        System.out.println("Mediana atual: " + mf.findMedian()); // 2.0
    }
}