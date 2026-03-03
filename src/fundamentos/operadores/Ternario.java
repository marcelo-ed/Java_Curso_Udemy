package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double nota = 2.0;
		
		String resultadoParcial = nota <= 4 ? "foi reprovado." : 
			"está de recuperação.";
		
		String resultadoFinal = nota >= 7 ? 
				"foi aprovado." : resultadoParcial;
		
		System.out.println("O aluno " + resultadoFinal);
	}
}
