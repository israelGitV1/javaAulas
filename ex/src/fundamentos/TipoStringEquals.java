package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("Ex1");
		System.out.println("2" == "2"); // True;
		
		String s = new String("2");
		System.out.println("2" == s); // false (resultado errado)
		System.out.println("2".equals(s));// para corrigir resultado verdadeiro
		
		System.out.println("\n\nEX2");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		String s2 = entrada.next(); // .next() => tira os espaços em branco
		                            // .nextLine() => não tira
		System.out.println("2" == s2.trim()); // trim() tira os espaços em branco
		System.out.println("2".equals(s2.trim())); // comparação de Strings .equals(nomeVariacel)
		
		entrada.close();
	}
	
}
