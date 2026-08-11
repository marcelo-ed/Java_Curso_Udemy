package controle.desafios;

import java.util.Scanner;

public class DesafioDoWhile {

	public static void main(String[] args) {
		// Creates Scanner
		Scanner sc = new Scanner(System.in);
		
		double valorDigitado;
		double valorFinal = 0;
		int valoresDigitados = 0;
		double media;
		
		do {
			System.out.println("Por favor, digite um valor de 0 a 10, ou -1 para parar: ");
			valorDigitado = sc.nextDouble();
			
			if(valorDigitado >= 0 && valorDigitado <= 10) {
				valorFinal += valorDigitado;
				valoresDigitados += 1;

			}else if(valorDigitado != -1) {
				System.out.println("Por favor, digite um valor válido.");
			} else if(valoresDigitados < 0){
				media = valorFinal / valoresDigitados;
				System.out.println("Quantidade de valores válidos digitados: " + valoresDigitados);
				System.out.println("Média dos valores digitados: " + media);
			} else {
				System.out.println("Nenhum valor foi digitado.");
			}
		} while(valorDigitado != -1);
		
		sc.close();
	}
}
