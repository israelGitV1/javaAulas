package exercicios.controle;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		int num = 0,soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Soma numeros inteiros(digite um número negativo para sair)");
		while(num >= 0) {
			System.out.print("Digite um número: ");
			num = entrada.nextInt();
			if(num > 0) {
				soma +=num;
			}
			System.out.println("Soma = "+soma);
		}
		System.out.println("Fim !");
		entrada.close();
	}
}
