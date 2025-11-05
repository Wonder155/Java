package Pilha;

public class PrincipalPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.mostrar();

        pilha.desempilhar();
        pilha.mostrar();

        pilha.empilhar(40);
        pilha.empilhar(50);
        pilha.empilhar(60); // deve mostrar mensagem de pilha cheia
        pilha.mostrar();
    }
}
