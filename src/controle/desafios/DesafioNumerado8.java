package controle.desafios;

import java.util.Scanner;

// 8. Crie um programa que recebe 10 valores e ao final imprima o maior número. 
public class DesafioNumerado8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maiorNumero;
		double numeroAtual;
		
		System.out.print("Por favor, digite um número: ");
		maiorNumero = sc.nextDouble();		
		
		for(int i = 1; i < 10; i++) {
			System.out.print("Por favor, digite um número: ");
			numeroAtual = sc.nextDouble();
			
			if(numeroAtual > maiorNumero ) {
				maiorNumero = numeroAtual;
			}
		}
		
		System.out.print("\nO maior número inserido é " + maiorNumero);
		
		sc.close();
	}
}
