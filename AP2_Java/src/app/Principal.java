package app;

import Lista.Lista;
import Pilha.Pilha;
import Fila.Fila;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        int opcaoPrincipal;

        do {
            System.out.println("\n========= MENU PRINCIPAL =========");
            System.out.println("1 - Operar Lista");
            System.out.println("2 - Operar Pilha");
            System.out.println("3 - Operar Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = scanner.nextInt();

            switch (opcaoPrincipal) {
                case 1 -> menuLista(scanner, lista);
                case 2 -> menuPilha(scanner, pilha);
                case 3 -> menuFila(scanner, fila);
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcaoPrincipal != 0);

        scanner.close();
    }

    // ---------------- MENU LISTA ----------------
    private static void menuLista(Scanner sc, Lista lista) {
        int opcao;
        do {
            System.out.println("\n--- MENU LISTA ---");
            System.out.println("1 - Inserir valor");
            System.out.println("2 - Mostrar lista");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor: ");
                    int valor = sc.nextInt();
                    lista.inserir(valor);
                }
                case 2 -> lista.mostrar();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // ---------------- MENU PILHA ----------------
    private static void menuPilha(Scanner sc, Pilha pilha) {
        int opcao;
        do {
            System.out.println("\n--- MENU PILHA ---");
            System.out.println("1 - Empilhar valor");
            System.out.println("2 - Desempilhar valor");
            System.out.println("3 - Mostrar pilha");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor: ");
                    int valor = sc.nextInt();
                    pilha.empilhar(valor);
                }
                case 2 -> pilha.desempilhar();
                case 3 -> pilha.mostrar();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // ---------------- MENU FILA ----------------
    private static void menuFila(Scanner sc, Fila fila) {
        int opcao;
        do {
            System.out.println("\n--- MENU FILA ---");
            System.out.println("1 - Enfileirar valor");
            System.out.println("2 - Desenfileirar valor");
            System.out.println("3 - Mostrar fila");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor: ");
                    int valor = sc.nextInt();
                    fila.enfileirar(valor);
                }
                case 2 -> fila.desenfileirar();
                case 3 -> fila.mostrar();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
