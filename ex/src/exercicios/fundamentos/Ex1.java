package exercicios.fundamentos;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		double fahenheit,celsius;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite temperatura em Fahenheit: ");
		fahenheit = entrada.nextDouble();
		
		celsius =(fahenheit - 32)/1.8;
		
		System.out.printf("\nFahenheit: %.2f para Celsius: %.2f",fahenheit,celsius);
		entrada.close();
	}
	
}
