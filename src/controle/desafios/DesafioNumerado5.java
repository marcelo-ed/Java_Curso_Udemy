package controle.desafios;

import java.util.Scanner;

// 5. Refatorar o exercício 04, utilizando a estrutura switch. 
// PS: Achei o exercício meio sem sentido, switch não combina com esse contexto.
public class DesafioNumerado5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, insira o número inteiro desejado: ");
		int num = sc.nextInt();
		
		int numeroDeDivisores = 0;
		
		if (num <= 1) {
			System.out.println("O número inserido não é um primo.");
			sc.close();
			return;
		} else {
			for(int i = 2; i <= num - 1; i++) {
				if(num % i == 0) {
					numeroDeDivisores += 1;
				}
			}
		}
		
		switch(numeroDeDivisores) {
		case 0:
			System.out.println("O número inserido é primo.");
			break;
		default: 
			System.out.println("O número inserido não é primo e tem " + (numeroDeDivisores + 1) + " divisores.");
		}
		
		sc.close();
	}
}
