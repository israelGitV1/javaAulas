package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe o número: ");
		
		int numero = Integer.parseInt(valor);
		//so if
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		}
		// so if
		if(numero % 2 == 1) { 
			System.out.println("Numero ímpar!");
		}
		
		// if e else
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		}else 
			System.out.println("Número ímpar!");
				
	}
	
}
