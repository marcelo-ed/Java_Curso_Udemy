package controle.desafios;

import java.util.Scanner;

// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par; 
public class DesafioNumerado1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, insira um número inteiro: ");
		int num = sc.nextInt();

		if((num > 0) && (num < 10) && (num % 2 == 0)) {
			System.out.println("Este número é par e está entre 0 e 10.");
		} else {
			System.out.println("Este número não é par ou não está entre 0 e 10.");
		}
		
		sc.close();
	}
}
