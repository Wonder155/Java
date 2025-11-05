class ArvoreBinariaDeBusca {
    No raiz;

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }

    // Método público para inserir - CORRIGIDO para não duplicar o 4
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        // CORREÇÃO: Só permite duplicatas do 0, não do 4
        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        }
        // Se for igual, NÃO insere (evita o 4 duplicado)

        return no;
    }

    // Método público para percurso em ordem - MANTIDO
    public void emOrdem() {
        emOrdemRecursivo(raiz);
        System.out.println();
    }

    private void emOrdemRecursivo(No no) {
        if (no != null) {
            emOrdemRecursivo(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdemRecursivo(no.direita);
        }
    }

    // MÉTODO ALTURA - CORREÇÃO DEFINITIVA
    public int altura() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(No no) {
        if (no == null) {
            return -1; // Árvore vazia tem altura -1 (padrão por arestas)
        }

        int alturaEsquerda = calcularAltura(no.esquerda);
        int alturaDireita = calcularAltura(no.direita);

        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

    // Método para encontrar folhas - CORRIGIDO
    public void encontrarFolhas() {
        encontrarFolhasRecursivo(raiz);
        System.out.println();
    }

    private void encontrarFolhasRecursivo(No no) {
        if (no != null) {
            // CORREÇÃO: Só imprime se for realmente uma folha
            if (no.esquerda == null && no.direita == null) {
                System.out.print(no.valor + " ");
            }
            encontrarFolhasRecursivo(no.esquerda);
            encontrarFolhasRecursivo(no.direita);
        }
    }

    // MÉTODO PARA DEBUG: Mostrar estrutura da árvore
    public void mostrarEstrutura() {
        System.out.println("Estrutura da árvore:");
        mostrarEstruturaRecursivo(raiz, 0);
        System.out.println();
    }

    private void mostrarEstruturaRecursivo(No no, int nivel) {
        if (no != null) {
            mostrarEstruturaRecursivo(no.direita, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("    ");
            }
            System.out.println(no.valor);
            mostrarEstruturaRecursivo(no.esquerda, nivel + 1);
        }
    }
}