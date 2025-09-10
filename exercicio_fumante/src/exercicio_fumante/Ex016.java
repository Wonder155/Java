package exercicio_fumante;
import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Digite a quantidade de anos que você já fumou: ");
        int anosFumados = scanner.nextInt();

        int totalCigarros = cigarrosPorDia * anosFumados * 365;

        double minutosPerdidos = totalCigarros * 10;

        double diasPerdidos = minutosPerdidos / 1440;


        System.out.printf("Você já perdeu %.2f dias de vida devido ao fumo.%n", diasPerdidos);
        System.out.println("----------------------------------------");

        scanner.close();
    }
}