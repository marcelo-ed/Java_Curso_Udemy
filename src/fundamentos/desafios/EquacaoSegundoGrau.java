package fundamentos.desafios;

import java.util.Scanner;

// Desafio:
// Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
//utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

// Resolvi usar condicionais para deixar o código mais lógico, mesmo que ainda não tenha sido apresentado.
public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Coletando a, b e c
		System.out.print("Insira o a: ");
		double a = sc.nextDouble();
		System.out.print("Insira o b: ");
		double b = sc.nextDouble();
		System.out.print("Insira o c: ");
		double c = sc.nextDouble();
		
		if (a == 0) {
			// Se não há x^2, por definição, a equação não é de segundo grau
			System.out.println("Esta não é uma equação de segundo grau.");
		} else {
			double delta = (b * b) - (4 * a * c);

			if (delta < 0) {
				// Se o delta for negativo, não há nenhuma solução real.
				System.out.println("\nA equação proposta não tem solução real.");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("\nA solução é: " + x);
			} else {

				double solucao1 = (-b - Math.sqrt(delta)) / (2 * a);
				double solucao2 = (-b + Math.sqrt(delta)) / (2 * a);

				System.out.println("\nSolução 1: " + solucao1);
				System.out.println("Solução 2: " + solucao2);
			}
		}

		sc.close();
	}
}
