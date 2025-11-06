class ArvoreBinariaDeBusca {
    No raiz;

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }

    // Inserção sem duplicatas
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }
        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        }
        // se for igual, ignora (não permite duplicatas)
        return no;
    }

    // Percurso em ordem
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

    // Encontrar folhas
    public void encontrarFolhas() {
        encontrarFolhasRecursivo(raiz);
        System.out.println();
    }

    private void encontrarFolhasRecursivo(No no) {
        if (no != null) {
            if (no.esquerda == null && no.direita == null) {
                System.out.print(no.valor + " ");
            }
            encontrarFolhasRecursivo(no.esquerda);
            encontrarFolhasRecursivo(no.direita);
        }
    }

    // Altura da árvore
    public int altura() {
        return alturaRecursivo(raiz);
    }

    private int alturaRecursivo(No no) {
        if (no == null) return -1;
        int altEsq = alturaRecursivo(no.esquerda);
        int altDir = alturaRecursivo(no.direita);
        return Math.max(altEsq, altDir) + 1;
    }

    // =======================
    // Desenho da árvore com setas
    // =======================
    public void desenharComSetas() {
        System.out.println("\nEstrutura da Árvore com Setas:");
        System.out.println("================================");
        desenharComSetasRec(raiz, "", true);
        System.out.println("================================");
    }

    private void desenharComSetasRec(No no, String prefixo, boolean ehUltimo) {
        if (no != null) {
            System.out.print(prefixo);
            System.out.println((ehUltimo ? "└── " : "├── ") + no.valor);

            // Atualiza o prefixo para os filhos
            String novoPrefixo = prefixo + (ehUltimo ? "    " : "│   ");
            if (no.esquerda != null || no.direita != null) {
                // Filho esquerdo (se existir)
                if (no.esquerda != null) {
                    desenharComSetasRec(no.esquerda, novoPrefixo, no.direita == null);
                }
                // Filho direito (se existir)
                if (no.direita != null) {
                    desenharComSetasRec(no.direita, novoPrefixo, true);
                }
            }
        }
    }
}
