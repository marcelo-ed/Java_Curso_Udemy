package classes.produto;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 3999.99, 0.25);
		p1.nome = "Notebook 2";
		p1.preco = 4999.99;
		p1.desconto = 0.40;
		
		Produto p2 = new Produto();
		p2.nome = "Caneta 2";
		p2.preco = 10;
		p2.desconto = 0.10;
		
		double precoFinal1 = p1.getPrecoFinal(0.15);
		double precoFinal2 = p2.getPrecoFinal(0);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("%s: %.2f%n", p1.nome, precoFinal1);
		System.out.printf("%s: %.2f%n", p2.nome, precoFinal2);
		System.out.printf("Preço médio do carrinho: %.2f%n", mediaCarrinho);	}
}
