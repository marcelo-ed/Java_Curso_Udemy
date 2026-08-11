package controle.condicionais;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		String conceito = "";
		
		System.out.println("Por favor, insira a nota: ");
		int nota = sc.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		
		case 7: case 8:
			conceito = "B";
			break;
		
		case 5: case 6:
			conceito = "C";
			break;
		
		case 3: case 4:
			conceito = "D";
			break;
		
		case 0: case 1: case 2:
			conceito = "E";
			break;

		default:
			conceito = "Conceito não encontrado.";
		}
		
		System.out.println("Conceito: " + conceito);
		
		sc.close();
	}
}
