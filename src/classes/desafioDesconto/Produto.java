package classes.desafioDesconto;

// O cenário hipotético é que uma loja possui um sistema onde todos os produtos sempre possuem o mesmo desconto.
// Por padrão, o desconto sempre será de 25%, mas pode mudar com o tempo.
public class Produto {
	String nome;
	double preco = 0.25;
	static double desconto = 0.25;
	
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	double getPrecoFinal() {
		double precoFinal = preco - (desconto * preco);
		return precoFinal;
	}
}
