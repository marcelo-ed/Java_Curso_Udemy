package fundamentos;

import java.util.Scanner;

public class AreaCircunferencia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, insira o valor do raio");
		int raio = scanner.nextInt();
		
		final double PI = 3.1415926;
		
		System.out.println("A área do círculo é " + PI * Math.pow(raio, 2));
		
		scanner.close();
	}
}
