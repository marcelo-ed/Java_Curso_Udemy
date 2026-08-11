package controle.condicionais;

public class ContinueRotulado {
	@SuppressWarnings("unused")

	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) {
				interno: for (int j = 0; j < 3; j++) {
					if(i == 1) {
						// Por padrão, ele sairia do break interno. Como especifiquei com o rótulo,
						// agora vai sair do externo
						continue externo;
					}
					System.out.printf("[%d, %d]", i, j	);
				}
			System.out.println();
		}
	}
}
