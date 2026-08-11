package controle.desafios;

import java.util.Scanner;

// 3. Criar um programa que receba duas notas parciais, calcular a média final.
// Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
// se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
// caso contrário imprime no console "Reprovado".
public class DesafioNumerado3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, insira a primeira nota: ");
		double n1 = sc.nextDouble();
		System.out.println("Por favor, insira a segunda nota: ");
		double n2 = sc.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		if(n1 > 10 || n1 < 0 || n2 > 10 || n2 < 0) {
			System.out.println("As notas inseridas devem estar entre 0 e 10.");
		} else if(media >= 7) {
			System.out.println("Aprovado");
		} else if(media > 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
}
