package controle.repeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// Creates Scanner
		Scanner sc = new Scanner(System.in);

		String resposta = "sim";
		do {
			System.out.println("Você precisa falar 'sim' para parar o programa."
					+ "\nQuer sair? ");
			resposta = sc.nextLine();
			
		} while(!resposta.equalsIgnoreCase("sim"));
		
		
		sc.close();
	}
}
