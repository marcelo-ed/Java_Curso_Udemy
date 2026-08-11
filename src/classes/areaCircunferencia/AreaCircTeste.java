package classes.areaCircunferencia;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc ac1 = new AreaCirc(15);
		// Acessar atributos estáticos através de uma instância funciona, mas não é recomendável, por isso o aviso do eclipse
		// ac1.PI = 3.1;
		
		AreaCirc ac2 = new AreaCirc(10);
		// Como é estático, PI vai valer 3 para ambos os objetos
		// ac2.PI = 3;
		
		System.out.println(ac1.calcArea());
		System.out.println(ac2.calcArea());
		
		// O certo seria acessar diretamente através da classe.
		// AreaCirc.PI = 3.1415;
		
		// PS: Comentei as mudanças no valor de PI porque deixei o atributo como uma constante.
	}
}
