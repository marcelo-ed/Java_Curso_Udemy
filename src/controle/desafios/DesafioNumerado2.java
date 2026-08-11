package controle.desafios;

import java.util.Scanner;

// 2. Criar um programa informa se o ano atual é um ano bissexto; 
public class DesafioNumerado2 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, informe o ano desejado: ");
		int ano = sc.nextInt();
		
		if((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)) ) {
			System.out.println("O ano " + ano + " é um ano bissexto.");
		} else {
			System.out.println("O ano " + ano + " não é um ano bissexto.");
		}
		
		sc.close();
	}
}
