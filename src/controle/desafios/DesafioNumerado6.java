package controle.desafios;

import java.util.Random;
import java.util.Scanner;

// 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. 
// O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima 
// a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado. 
public class DesafioNumerado6 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int numeroSorteado = random.nextInt(100) + 1;

		int tentativasSobrando = 10;
		int palpite = 0;
		while (palpite != numeroSorteado && tentativasSobrando > 0) {
			System.out.printf("%n%nVocê tem " + tentativasSobrando + " tentativas sobrando.");
			System.out.printf("%nPor favor, chute um número de 1 a 100: ");
			palpite = sc.nextInt();

			if (palpite < 1 || palpite > 100) {
				// Se estiver fora do intervalo possível, o programa avisa e a tentativa não
				// conta.
				System.out.println("Por favor, insira apenas números entre 1 e 100.");
				continue;
			} else if (palpite == numeroSorteado) {
				System.out.println("Parabéns! Você acertou o número!");
			} else if (palpite < numeroSorteado) {
				System.out.println("O número sorteado é maior do que este.");
			} else if (palpite > numeroSorteado) {
				System.out.println("O número sorteado é menor do que este.");
			}

			tentativasSobrando -= 1;
		}

		sc.close();
	}
}
