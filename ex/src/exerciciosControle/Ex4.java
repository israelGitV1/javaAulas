package exerciciosControle;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    double num;
	    
	    System.out.println("Retorna se o número é primo");
	    System.out.print("Digite um número: ");
	    num = entrada.nextDouble();
	    
	    if((num % 2 ) != 0)
	    	System.out.println("Número é primo!");
	    else
	    	System.out.println("Número não é primo");
		entrada.close();
	}
}
