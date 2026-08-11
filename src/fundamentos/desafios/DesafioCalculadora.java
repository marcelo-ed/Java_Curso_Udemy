package fundamentos.desafios;
import java.util.Scanner;

// O desafio é ler 2 números, fazer o usuário escolher uma operação matemática e realizá-la
// Não se pode usar condicionais, apenas o que foi visto no primeiro módulo do curso
public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro número: ");
		double num1 = sc.nextDouble();
		System.out.printf("%nDigite o segundo número: ");
		double num2 = sc.nextDouble();
		
		// Caso escrevesse apenas um "%", como está dentro de um printf, o java interpretaria como se
		// eu quisesse usar um tipo "%)". Como ) não é um tipo válido, daria erro.
		System.out.printf("%nDigite o dipo de operação (+, -, *, / ou %%): ");
		String operador = sc.next();
		
		double resultado = operador.equals("+") ? num1 + num2 : 0;
		resultado = operador.equals("-") ? num1 - num2 : resultado;
		resultado = operador.equals("*") ? num1 * num2 : resultado;
		resultado = operador.equals("/") ? num1 / num2 : resultado;
		resultado = operador.equals("%") ? num1 % num2 : resultado;
		
		
		System.out.printf("%nResultado: %.2f", resultado);
		
		sc.close();
	}
}
