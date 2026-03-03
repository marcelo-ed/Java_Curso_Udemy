package fundamentos.desafios;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		// Trabalho na terça-feira (V ou F)
		// Trabalho na quinta-feira (V ou F)
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		boolean tomouSorvete = trabalhoTerca || trabalhoQuinta;
		boolean maisSaudavel = !tomouSorvete;
		
		boolean comprouTV50 = trabalhoQuinta && trabalhoTerca;
		boolean comprouTV32 = trabalhoQuinta ^ trabalhoTerca;
		
		System.out.println("Comprou TV de 50\"? " + comprouTV50);
		System.out.println("Comprou TV de 32\"? " + comprouTV32);
		System.out.println("Tomou sorvete ? " + tomouSorvete);
		System.out.println("Está saudável? " + maisSaudavel);
	}
}
