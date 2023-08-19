package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		int numAlunos , numNotas;
		double[] soma , media;
		double[][] notasAlunos;
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Calcu média alunos \n Digite o número de alunos: ");
		numAlunos = entrada.nextInt();
		System.out.print("Digite o número de notas: ");
		numNotas = entrada.nextInt();
	  	
		notasAlunos = new double[numAlunos][numNotas];
		soma = new double[numAlunos];
		media = new double [numAlunos];
		
		System.out.println(notasAlunos.length);
		System.out.println(notasAlunos[0].length);
		
		for (int a = 0; a < notasAlunos.length; a++) {
			for (int n = 0; n < (notasAlunos[a].length); n++) {
				System.out.printf("Aluno %d Digite a %d nota:",a+1,n+1);
				notasAlunos[a][n] = entrada.nextDouble();
				soma[a]+=notasAlunos[a][n];
			}
			System.out.println();
			media[a] = soma[a] / notasAlunos[a].length;
		}
//		for(int i = 0; i < soma.length ; i++){
//			media[i] = soma[i] / notasAlunos[i].length;
//		}
		
        for(int i = 0; i < media.length ; i++) {
        	System.out.printf("\n Aluno: %d \nsoma das notas: %.2f\nmédia: %.2f\n",i+1,soma[i],media[i]);
        }
		

		
		System.out.println();
		
		entrada.close();
	}
}
