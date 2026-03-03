package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("oi");
		System.out.println("\n\n");
		System.out.print("oi");
		System.out.println();

		System.out.printf("Números sorteados: %d, %d, %d, %d%n", 1, 2, 3, 4);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, digite seu nome e sobrenome: ");
		String nome = sc.next();
		String sobrenome = sc.next();
		System.out.println("Por favor, digite sua idade:");
		int idade = sc.nextInt();
		
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		sc.close();
	}
}
