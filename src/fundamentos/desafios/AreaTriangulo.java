package fundamentos.desafios;

import java.util.Scanner;

// Como o nome já diz, o objetivo é pegar a base e a altura de um triângulo, e calcular a área
public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a base do triângulo: ");
		double base = sc.nextDouble();
		System.out.printf("%nDigite a altura do triângulo: ");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("%nA área desse triângulo é: %f", area);
		
		sc.close();
	}
}
