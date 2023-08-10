package exercicios.controle;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num ;
		int calculoNumMode;
		System.out.println("Retorna se o número e primo");
		System.out.print("Digite um número: ");
		num =entrada.nextDouble();
		calculoNumMode = (int)num % 2;
		
		switch(calculoNumMode) {
		case 0:
			System.out.println("Número não é primo!");
			break;
		default:
			System.out.println("Número é primo");
		}
		
		entrada.close();
	}
}
