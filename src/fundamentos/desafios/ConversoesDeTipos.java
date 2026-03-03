package fundamentos.desafios;

import java.util.Scanner;

// O objetivo do teste é criar uma classe que pede os três últimos salários 
// de um funcionário e retornar a média. 
// O usuário deve poder escolher entre digitar vírgula ou ponto para separar as casas decimais.
// A classe não precisa apresentar tratamento adequado de erros. Isso virá posteriormente no curso.

public class ConversoesDeTipos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o primeiro salário: ");
		String salarioString1 = sc.nextLine().replace(",", ".");
		
		System.out.println("Por favor, digite o segundo salário: ");
		String salarioString2 = sc.nextLine().replace(",", ".");
		
		System.out.println("Por favor, digite o terceiro salário: ");
		String salarioString3 = sc.nextLine().replace(",", ".");
		
		double salarioNum1 = Double.parseDouble(salarioString1);
		double salarioNum2 = Double.parseDouble(salarioString2);
		double salarioNum3 = Double.parseDouble(salarioString3);

		double media = (salarioNum1 + salarioNum2 + salarioNum3) / 3;
		
		System.out.println("A média dos últimos três salários desse funcionário é " + media);
		
		sc.close();
	}
}
