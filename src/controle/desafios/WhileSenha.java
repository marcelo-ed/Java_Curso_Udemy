package controle.desafios;

import java.util.Scanner;

//O desafio é fazer o usuário digitar coisas quantas vezes quiser, até acertar a "senha" para o programa parar
// Não se pode usar do while, pois ainda não foi mostrado
public class WhileSenha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha = "sair";
		String tentativa = "";
		
		// Enquanto o que o usuário tentou for diferente da senha, o programa continuará
		while(!senha.equalsIgnoreCase(tentativa)) {
			System.out.println("Por favor, digite a senha para parar o programa: ");
			tentativa = sc.nextLine();
		}
		sc.close();
	}
}
