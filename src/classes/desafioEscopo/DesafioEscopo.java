package classes.desafioEscopo;

// O desafio é conseguir utilizar, dentro do método main, uma forma de utilizar uma variável declarada fora.
public class DesafioEscopo {
	
	int a = 1; // Não se pode mexer nesta linha.
	
	public static void main(String[] args) {
		DesafioEscopo de = new DesafioEscopo();
		System.out.println(de.a);
	}
}
