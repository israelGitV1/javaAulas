package classe;

import java.util.Scanner;

public class MainData {
	public static void main(String[] args) {
		var data1 = new Data();
		Data data2 = new Data();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite primeira data: ");
		System.out.print("Dia: ");
		data1.dia = entrada.nextInt();
		System.out.print("Mês: ");
		data1.mes = entrada.nextInt();
		System.out.print("Ano: ");
		data1.ano = entrada.nextInt();
		
		System.out.println("Digite segunda data: ");
		System.out.print("Dia: ");
		data2.dia =entrada.nextInt();
		System.out.print("Mês: ");
		data2.mes =entrada.nextInt();
		System.out.print("Ano: ");
		data2.ano =entrada.nextInt();
		entrada.close();
		
		System.out.printf(" Data1: %s \n Data2: %s",data1.obterDataFormatada(),
				                                              data2.obterDataFormatada());
	}
}
