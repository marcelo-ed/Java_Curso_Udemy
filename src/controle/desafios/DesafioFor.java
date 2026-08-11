package controle.desafios;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		for(int i = 0; i < 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Versão do desafio: atingir o mesmo resultado, mas sem usar números para controlar o For.
		System.out.printf("%nVersão do desafio abaixo:%n%n");
		
		String valorAtual;
		String valorDesejado = "######";
		
		for(valorAtual = "#"; !valorAtual.equals(valorDesejado); valorAtual += "#") {
			System.out.println(valorAtual);
		}
	}
}
