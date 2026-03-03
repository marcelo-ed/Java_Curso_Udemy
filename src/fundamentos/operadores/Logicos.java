package fundamentos.operadores;

public class Logicos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || !condicao2);
		System.out.println(condicao1 ^ !condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("Tabela verdade do E (&&)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("Tabela verdade do OU (||)\n");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("Tabela verdade do E OU EXCLUSIVO (^)\n");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("Tabela verdade do NOT (!)");
		System.out.println(!true);
		System.out.println(!false);
	}
}
