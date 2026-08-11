package controle.repeticao;

public class For2 {

	public static void main(String[] args) {
		for(int i = 10; i >= 0; i--) {
			for(int j = 0; j <= 10; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
	}
}
