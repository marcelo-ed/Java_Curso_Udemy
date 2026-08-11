package controle.condicionais;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a nota do aluno: ");
		double nota = sc.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.println("A nota inserida é inválida");
		} else if (nota < 3) {
			System.out.println("Nota: II");
		} else if (nota < 5) {
			System.out.println("Nota: MI");
		} else if (nota < 7) {
			System.out.println("Nota: MM");
		} else if (nota < 9) {
			System.out.println("Nota: MS");
		} else {
			System.out.println("Nota: SS");
		}
		sc.close();
	}
}
