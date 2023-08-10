package exercicios.controle;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota1,nota2,media;
		
		System.out.println("Calcula média Final");
		System.out.print("Nota parcial 1: ");
		nota1=entrada.nextDouble();
		System.out.print("Nota parcial 2: ");
		nota2=entrada.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if(media >= 7)
			System.out.print("Aprovado!");
		else if(media < 7 && media > 4)
			System.out.print("Recuperação!");
		else
			System.out.print("Reprovado!");
		
		entrada.close();
	}
}
