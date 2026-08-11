package controle.condicionais;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a média do aluno: ");
		double media = sc.nextDouble();
		
		if (media < 0 || media > 10) {
		    System.out.println("A nota inserida é inválida");
		} else if (media < 7) {
		    System.out.println("O aluno foi reprovado");
		} else {
		    System.out.println("O aluno foi aprovado");
		}
		
		sc.close();
	}
}
