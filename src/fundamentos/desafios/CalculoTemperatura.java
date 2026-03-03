package fundamentos.desafios;

import java.util.Scanner;

// O objetivo do desafio é criar um conversor de graus fahrenheit para graus celsius.
// Ainda não há tratamento de erros ou funcionalidades complexas, pois é apenas um desafio inicial.
public class CalculoTemperatura {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, insira a temperatura em graus fahrenheit: ");
		double f = sc.nextDouble();
		
		final int AJUSTE  = 32;
		final double MULTIPLICADOR = 5.0/9.0;
		
		double c = (f - AJUSTE) * MULTIPLICADOR;
		
		System.out.println(f + " °F é equivalente a " + c + "°C.");
		
		sc.close();
	}
}
