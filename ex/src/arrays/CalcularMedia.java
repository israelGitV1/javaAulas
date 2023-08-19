package arrays;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numeroNotas;
	    double soma = 0, media = 0;
	    
		System.out.print("  Calcula média!\n Para Calcular a média informe o número de notas: ");
	    numeroNotas=entrada.nextInt();
	    double[] notas = new double[numeroNotas];
	    
	    for(int i = 0;i< notas.length; i++) {
	    	System.out.printf("Digite a %d nota: ",i+1);
	    	notas[i] = entrada.nextDouble();
	    }
	    entrada.close();
	    
	    for(double nota: notas) {
	    	soma += nota;
	    }
	    media = soma / notas.length;
	    System.out.printf(" Soma da notas: %.2f \n Média: %.2f",soma,media);
	    
	}
}