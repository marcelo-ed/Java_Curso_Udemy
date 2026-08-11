package classes.produto;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto() {
		
	}
	
	Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public double getPrecoFinal(double descontoExtra) {
		double precoFinal = preco - (preco * (desconto + descontoExtra));
		return precoFinal;
	}
}
