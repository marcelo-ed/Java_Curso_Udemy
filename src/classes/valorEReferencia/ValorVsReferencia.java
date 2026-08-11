package classes.valorEReferencia;

import classes.desafioData.Data;

public class ValorVsReferencia {
	public static void main(String[] args) {
		// ----- Atribuição por valor -----
		
		double a = 2;
		double b = a; 
		a++;
		b--;
		
		// Como a atribuição foi por valor, eles não refletem as mudanças um do outro.
		System.out.println(a); 
		System.out.println(b);
		
		int c = 0;
		// Quando uma variável primitiva é passada para um método, as alterações feitas no método não são refletidas 
		// na variável original. Isso porque é passado o valor da variável, não o endereço de memória.
		alterarPrimitivo(c);
		System.out.println(c); 

		System.out.println();
		
		// ----- Atribuição por referência -----
		
		Data d1 = new Data(1, 2, 2020);
		Data d2 = d1; // Atribuição por referência
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2030;
		
		// Como d2 foi atriubuído por referência, qualquer alteração nele também vai influenciar d1.
		
		System.out.println(d1.dataCompleta());
		System.out.println(d2.dataCompleta());
		
		// Quando se insere um objeto como entrada de uma função, 
		// qualquer alteração dentro da função é refletida no escopo global.
		// Não é recomendado.
		voltarDataParaValorPadrao(d2);

		System.out.println(d1.dataCompleta());
		System.out.println(d2.dataCompleta());
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int i) {
		i++;
	}
}
