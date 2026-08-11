package classes.desafioDesconto;

public class TesteProduto {
	public static void main(String[] args) {
		Produto p1 = new Produto("Mochila", 199.90);
		Produto p2 = new Produto("Caderno", 19.90);
		
		System.out.println(p1.nome + " " +p1.getPrecoFinal());
		System.out.println(p2.nome + " " +p2.getPrecoFinal());

		Produto.desconto = 0.5;
		System.out.println("-------- Depois do desconto --------");
		System.out.println(p1.nome + " " +p1.getPrecoFinal());
		System.out.println(p2.nome + " " +p2.getPrecoFinal());
	}
		
}
