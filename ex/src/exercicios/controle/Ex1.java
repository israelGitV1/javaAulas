package exercicios.controle;

import java.util.Scanner;

public class Ex1 {

	public static void main( String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero de 0 a 10: ");
		int numero = entrada.nextInt();
		if(numero >= 0 && numero < 11) {
		  if(numero % 2 == 0)
			  System.out.println("Número "+numero+" é par");
		  else
			  System.out.println("Número "+numero+" é impar");
		}
		else {
	    System.out.println("Valor digitado não e valido!");
		}
		entrada.close();
	}
}
