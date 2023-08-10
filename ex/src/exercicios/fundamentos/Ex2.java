package exercicios.fundamentos;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		double celsius,fahrenheit;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Temperatura em Celsius: ");
		celsius = entrada.nextDouble();
		
		fahrenheit = (celsius * 1.8)+32;
		
		System.out.printf("\nTemperatura Celsius: %.2f Para Fahrenheit: %.2f"
				          ,fahrenheit,celsius);
		
		entrada.close();
	}
}
