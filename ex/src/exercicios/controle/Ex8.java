package exercicios.controle;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		String palavra ;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma Palavra: ");
		palavra = entrada.nextLine();
		
		for(int i = 0;i<palavra.length();i++) {
			System.out.println(palavra.charAt(i));
		}
		entrada.close();
	}
}
