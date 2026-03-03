package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
//		x++ e x-- aumentam ou diminuem o valor da variável em 1.
//		Há a forma pré-fixada e a forma pós-fixada.
//		A forma pós-fixada retorna o valor atual, depois atribui o novo valor.
		a++;
		a--;
		
//		A forma pré-fixada atualiza o valor, depois retorna o novo valor.
		++b;
		--b;
		
		System.out.println(a + ", " + b );
		
//		Por exemplo, o resultado dessa operação é true. Isso porque o ++a primeiro atualiza para	 
//		o novo valor (2), depois retorna 2, enquanto o b++ primeiro retorna o valor antigo (2), depois atualiza.
		System.out.println("a++ == b++? " + (++a == b++));
		
//		De qualquer forma, é evitável misturar incrementos com comparação, pois causa confusão.
	}
}
