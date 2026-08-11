package controle.desafios;

import java.util.Scanner;

//7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números 
// inseridos, caso receba um número negativo, encerre o programa. 
// Tente utilizar a estrutura do while. 

public class DesafioNumerado7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numeroAtual = 0;
		double somaTotal = 0;
		do {
			System.out.printf("\nPor favor, digite um número positivo para continuar, ou um negativo para parar: ");
			numeroAtual = sc.nextDouble();
			if(numeroAtual >= 0) {
				somaTotal += numeroAtual;
				System.out.printf("\nSoma dos números inseridos: " + somaTotal);
			}
		} while(numeroAtual >= 0);
		
		System.out.printf("\nPrograma finalizado.\n");
		System.out.println("Soma final: " + somaTotal);
		
		sc.close();
	}
}
