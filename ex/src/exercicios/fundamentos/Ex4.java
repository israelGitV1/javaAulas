package exercicios.fundamentos;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		double valor,quadrado,cubo;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		valor = entrada.nextDouble();

		quadrado =Math.pow(valor,2);
		cubo = Math.pow(valor, 3);
		
		System.out.printf("\nValor: %.2f ao Quadrado: %.2f e Cubo: %.2f",valor,quadrado,cubo);
		
		entrada.close();
	}
	
}
