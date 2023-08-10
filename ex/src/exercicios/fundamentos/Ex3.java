package exercicios.fundamentos;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		double peso,altura,imc;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Peso: ");
		peso = entrada.nextDouble();
		System.out.print("Altura: ");
		altura = entrada.nextDouble();
		
		imc = peso / (altura*2);

		System.out.printf("IMC: %.2f", imc);
		entrada.close();
	}
}
