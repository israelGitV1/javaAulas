package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//if(..) sentenca; ou {}
		// while(...) sentenca; ou {}
		// for (..;..;...) sentenca; ou {}
		
		//do {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		System.out.println("Você precisa falar"
		          +"as palavras Mágicas...");
		do {
			System.out.print("Quer sair? : ");
			texto = entrada.nextLine();
		} while (! texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}
