package controle;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bom dia!");
		String resposta = entrada.next();
		
		while(! resposta.equalsIgnoreCase("sair")) {
			resposta = entrada.next();
		}
		entrada.close();
		System.out.println("Fim!");
	}
}
