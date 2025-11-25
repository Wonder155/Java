package exercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MesclarListas {

    // Classe auxiliar para rastrear de qual lista veio o elemento
    static class Node implements Comparable<Node> {
        int value;
        int listIndex;      // Índice da lista na lista de listas
        int elementIndex;   // Índice do elemento dentro da sub-lista

        public Node(int value, int listIndex, int elementIndex) {
            this.value = value;
            this.listIndex = listIndex;
            this.elementIndex = elementIndex;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.value, other.value);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> listas = new ArrayList<>();
        listas.add(Arrays.asList(1, 4, 5));
        listas.add(Arrays.asList(1, 3, 4));
        listas.add(Arrays.asList(2, 6));

        System.out.println("Lista mesclada: " + mergeKSortedLists(listas));
    }

    public static List<Integer> mergeKSortedLists(List<List<Integer>> lists) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Node> minHeap = new PriorityQueue<>();

        // 1. Inicializa o heap com o primeiro elemento de cada lista
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) != null && !lists.get(i).isEmpty()) {
                minHeap.add(new Node(lists.get(i).get(0), i, 0));
            }
        }

        // 2. Extrai o menor e adiciona o sucessor dele ao heap
        while (!minHeap.isEmpty()) {
            Node node = minHeap.poll();
            result.add(node.value);

            int nextElementIndex = node.elementIndex + 1;
            List<Integer> originList = lists.get(node.listIndex);

            if (nextElementIndex < originList.size()) {
                minHeap.add(new Node(originList.get(nextElementIndex), node.listIndex, nextElementIndex));
            }
        }

        return result;
    }
}