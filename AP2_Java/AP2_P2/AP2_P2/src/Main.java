public class Main {
    public static void main(String[] args) {
        System.out.println("=== PROVA: ESTRUTURAS DE DADOS (TADs) ===");
        System.out.println("Árvore Binária de Busca - BST\n");

        // Criar a árvore
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();

        // Sequência do RA: 2, 4, 0, 4, 0, 6, 6
        int[] sequenciaRA = {2, 4, 0, 4, 0, 6, 6};

        System.out.print("Sequência de inserção: ");
        for (int num : sequenciaRA) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Inserir todos os elementos na árvore
        for (int num : sequenciaRA) {
            arvore.inserir(num);
        }

        // DEBUG: Mostrar estrutura
        arvore.mostrarEstrutura();

        // Responder às questões da prova
        System.out.println("=== CARACTERÍSTICAS DA ÁRVORE RESULTANTE ===");

        // Raiz
        System.out.println("• Raiz: " + (arvore.raiz != null ? arvore.raiz.valor : "Árvore vazia"));

        // Folhas
        System.out.print("• Folhas (Nós sem filhos): ");
        arvore.encontrarFolhas();

        // Altura da Árvore
        System.out.println("• Altura da Árvore: " + arvore.altura());

        // Percurso Em Ordem
        System.out.print("• Percurso Em Ordem (Ordenado): ");
        arvore.emOrdem();

        System.out.println("\n=== IMPLEMENTAÇÃO CONCLUÍDA ===");
    }
}