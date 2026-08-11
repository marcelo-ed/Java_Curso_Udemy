package controle.desafios;

import java.util.Scanner;

// 4. Criar um programa que receba um número e diga se ele é um número primo. 
public class DesafioNumerado4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, insira o número inteiro desejado: ");
		int num = sc.nextInt();
		
		boolean ehPrimo = true;
		
		if (num <= 1) {
		    ehPrimo = false;
		} else {
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					ehPrimo = false;
					break;
				}
			}
		}
		
		if(ehPrimo) {
			System.out.println("O número inserido é primo.");
		} else {
			System.out.println("O número inserido não é primo.");
		}
		
		sc.close();
	}
}
