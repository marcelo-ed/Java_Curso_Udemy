package controle.repeticao;

public class For3 {
	public static void main(String[] args) {
		for(int i = 3; i < 20000000; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		System.out.println("Como saiu do for, posso "
				+ "declarar o i de novo: " + i);
	}
}
