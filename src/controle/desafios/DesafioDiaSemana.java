package controle.desafios;

import java.util.Scanner;

// O desafio é retornar o número correspondente ao dia da semana digitado.
// Ex: domigo = 1, segunda = 2...
// Não se pode usar switch, pois o objetivo é treinar o if
public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		// Troca letras maiúsculas por letras minúsculas
		String diaDigitado = sc.next().toLowerCase();
		int numeroDoDia = 0;
		
		if(diaDigitado.equals("domingo")) {
			numeroDoDia = 1;
		} else if(diaDigitado.equals("segunda")) {
			numeroDoDia = 2;
		} else if(diaDigitado.equals("terça") || diaDigitado.equals("terca")) {
			numeroDoDia = 3;
		} else if(diaDigitado.equals("quarta")) {
			numeroDoDia = 4;
		} else if(diaDigitado.equals("quinta")) {
			numeroDoDia = 5;
		} else if(diaDigitado.equals("sexta")) {
			numeroDoDia = 6;
		} else if(diaDigitado.equals("sábado") || diaDigitado.equals("sabado")) {
			numeroDoDia = 7;
		}
		
		// Se o valor continuar igual ao do início, significa que o dia digitado não foi reconhecido.
		if(numeroDoDia != 0) {
			System.out.println("\nNúmero do dia: " + numeroDoDia);
		} else {
			System.out.println("\nO dia digitado é inválido.");
		}
		
		sc.close();
	}
}
