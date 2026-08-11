package controle.condicionais;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "Preta";
		
		// Nota: se não tiver break, ele vai ativar todos os "case" depois de ativar o primeiro
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Eu sei o Bassai-Dai");
			
		case "marrom":
			System.out.println("Eu sei o Tekki-shodan");
			
		case "roxa":
			System.out.println("Eu sei o Heian Godan");
		
		case "verde":
			System.out.println("Eu sei o Heian Yandan");
		
		case "laranja":
			System.out.println("Eu sei o Heian Sandan");
		
		case "vermelha":
			System.out.println("Eu sei o Heian Nidan");
		
		case "amarela":
			System.out.println("Eu sei o Heian Shodan");
		}
	}
}
