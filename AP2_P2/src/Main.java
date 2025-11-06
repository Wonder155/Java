public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROVA: ESTRUTURAS DE DADOS (TADs) ===");
        System.out.println("Árvore Binária de Busca - BST\n");

        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();

        // Sequência sem repetição
        int[] sequenciaRA = {2, 4, 0, 6};

        System.out.print("Sequência de inserção: ");
        for (int num : sequenciaRA) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Inserir elementos
        for (int num : sequenciaRA) {
            arvore.inserir(num);
        }

        // Características da árvore
        System.out.println("=== CARACTERÍSTICAS DA ÁRVORE RESULTANTE ===");
        System.out.println("• Raiz: " + (arvore.raiz != null ? arvore.raiz.valor : "Árvore vazia"));
        System.out.print("• Folhas (Nós sem filhos): ");
        arvore.encontrarFolhas();
        System.out.println("• Altura da Árvore: " + arvore.altura());
        System.out.print("• Percurso Em Ordem (Ordenado): ");
        arvore.emOrdem();

        // Desenho da árvore
        arvore.desenharComSetas();

        System.out.println("\n=== IMPLEMENTAÇÃO CONCLUÍDA ===");
    }
}