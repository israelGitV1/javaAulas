package exercicios.fundamentos;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		double a,b,c,x1,x2,delta;
		
		System.out.println("Equação do segundo grau"
				+ "\n ax2 + bx + c = 0");
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor de a: ");
		a = 1;
		System.out.print("Valor de b: ");
		b = -1;
		System.out.print("Valor de c: ");
		c = -12;
		
		delta = (Math.pow(b, 2))-(4 * c * a);
		
		x1 = (-b + (Math.sqrt(delta))) / (2*a); 
		
		x2 = (-b - (Math.sqrt(delta))) / (2*a);
		
		System.out.printf("\n Saida delta: %.2f"
				+ "\n x1: %.2f"
				+ "\n x2: %.2f",delta,x1,x2);
		entrada.close();
	}
	
}
