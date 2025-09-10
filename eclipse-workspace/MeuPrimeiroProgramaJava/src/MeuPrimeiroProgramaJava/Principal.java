/**
 * 
 */
package MeuPrimeiroProgramaJava;

import java.util.Scanner;
/**
 * 
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Olá amigo!\n Qual é o seu nome");
		
		try (Scanner in = new Scanner(System.in)) {
			String nome = in.nextLine();
			
			System.out.printf("Olá %s!\n", nome);  
		} 
		

	}

}
