package fundamentos.desafios;

import java.util.Scanner;

// Precisa pegar um valor, depois retornar esse valor ao quadrado e ao cubo.
public class Potenciacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor: ");
		double valor = sc.nextDouble();
		
		double quadrado = valor * valor;
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("%nQuadrado: %f %nCubo: %f", quadrado, cubo);
		
		sc.close();
	}
}
