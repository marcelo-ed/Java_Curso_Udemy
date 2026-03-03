package fundamentos.desafios;
//O objetivo é representar a função (([6*(3 + 2)]² / (3 * 2)) - (((1 - 5) * (2 - 7)) / 2 )² )³ / 10³

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		
		double a = Math.pow((6 * (3 + 2)), 2) / (3*2);
		double b = Math.pow(((1-5) * (2-7)) / 2, 2);
		double c = a - b;
		double d = Math.pow(c, 3);
		
		double resultado = d / Math.pow(10, 3);
		System.out.println(resultado);
	}
}
