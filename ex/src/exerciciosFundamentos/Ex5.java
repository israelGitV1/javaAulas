package exerciciosFundamentos;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		double base,altura,area;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Caculo da área do triângulo: "
				       + "\nValor da base: ");
		base = entrada.nextDouble();
		System.out.print("Valor da altura: ");
		altura = entrada.nextDouble();
		
		area =(base*altura)/2;
		
		System.out.printf("Área do triângulo: %.2f",area);
		
		entrada.close();
	}
	
}
