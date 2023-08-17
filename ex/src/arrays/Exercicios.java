package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Exercicios {

	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[4];
		notasAlunoA[0]=7.9;
		notasAlunoA[1]=8;
		notasAlunoA[2]=6.7; // add notas um a um
		notasAlunoA[3]=9.7;
		
		System.out.println(notasAlunoA); // imprime um endereço de memoria e não o conteudo;
		System.out.println(Arrays.toString(notasAlunoA)); // metodo que imprime os dados de um array
		
		double totalAlunoA = 0;
//		for(int i =0;i < 3;i++) {
//			totalNotas += notasAlunoA[i];
//		}
//		
		for(int i =0;i < notasAlunoA.length;i++) { // .length um atributo que retorna o tamanho do array
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println("Total da soma de todas as notas: "+totalAlunoA);
//		System.out.println("Média do aluno: "+totalNotas/4);  sem o metodo 
		System.out.println("Média do alunoA: "+totalAlunoA/notasAlunoA.length); // atributo length
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9,8.9,notaArmazenada,10}; // usado quando ja tenho todos os valores no momento da criação do array
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println("Média do alunoB: "+totalAlunoB/notasAlunoB.length); // atributo length
	}
}
