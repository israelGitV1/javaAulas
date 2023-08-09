package fundamentos;

import java.util.Scanner;

public class DesafioConversão {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite Primeiro Salário: ");
		String salario1 = entrada.nextLine();
		salario1 =salario1.replace(",", ".");//formata entrada
		// resposta professor 
		//String salario1 = entrada.next().replace(",",".");
		
		System.out.print("Digite Segundo Salário: ");
		String salario2 = entrada.nextLine();
		salario2 =salario2.replace(",", ".");//formata entrada
		
		System.out.print("Digite Terceiro Salário: ");
		String salario3 = entrada.nextLine();
		salario3 =salario3.replace(",", ".");//formata entrada
		entrada.close(); //fecha entrada
		
		
		double media =(Double.parseDouble(salario1)+
				       Double.parseDouble(salario2)+
				       Double.parseDouble(salario3))/3; // calcula
		        
		System.out.println("Media dos Salários: "+ media); // Saida
		
	}
}
