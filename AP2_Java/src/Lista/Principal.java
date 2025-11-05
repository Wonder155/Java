package Lista;

public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.mostrar();

        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60); // Deve mostrar mensagem de lista cheia
        lista.mostrar();
    }
}
