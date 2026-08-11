package controle.condicionais;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe um número inteiro:");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("O número inserido é par");
		} else {
			System.out.println("O número inserido é impar");
		}
	}
}
