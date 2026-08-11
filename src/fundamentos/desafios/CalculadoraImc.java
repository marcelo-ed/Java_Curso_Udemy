package fundamentos.desafios;

import java.util.Scanner;

// A classe deve pegar a altura e o peso do usuário, e retornar o IMC
public class CalculadoraImc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("digite seu peso: ");
		double peso = sc.nextDouble();
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);

		System.out.println("IMC: " + imc);

		sc.close();
	}
}
