package fundamentos.tipos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		String a = "sotyer76";
		String b  = "sotyer76";
		
		// true. Para objetos, o "==" compara o endereço de memória, que nesse caso é o mesmo por
		// motivos explicados abaixo.
		System.out.println(a == b);
		
		String c = new String("sotyer76");
		// false. A string usa a string pool, então quando uma string tem valor igual à outra, o 
		// java simplismente aponta ambas para um dado que já existe. Quando se usa new String(),
		// você força a criação de um novo objeto, portanto o "==" dá errado.
		System.out.println(a == c);
		
		// true. Cada tipo de objeto pode fazer Override do equals, e no caso da String, ele foi
		// adaptado para comparar o conteúdo interno.
		System.out.println(a.equals(c));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número 2: ");
		String doisDigitado = sc.nextLine();
		
		//Falso, pois o doisDigitado foi criado em tempo de execução, e portanto tem outro endereço de memória.
		System.out.println("2" == doisDigitado.trim());
		// True, pois .equals() compara o conteúdo, não o endereço
		System.out.println("2".equals(doisDigitado.trim()));
		
		sc.close();
	}
}
