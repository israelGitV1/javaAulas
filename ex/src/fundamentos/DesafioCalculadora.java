package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
	    // + - * / %
		// fazer operaçao
		
		double num1,num2,resultado=0;
		String operacao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		num1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = entrada.nextDouble();
		System.out.print("Digite uma operação\n(*=> multiplicar"
				                            +  "\n - => menos"
				                            +  "\n + => mais"
				                            +  "\n / => divitir"
				                            +  "\n % => modulo):");
		operacao = entrada.next();
		resultado = operacao.equals("*")? num1 * num2 : resultado;
		resultado = operacao.equals("-")? num1 - num2 : resultado;
		resultado = operacao.equals("+")? num1 + num2 : resultado;
		resultado = operacao.equals("/")? num1 / num2 : resultado;
		resultado = operacao.equals("%")? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",num1,operacao,num2,resultado);
		entrada.close();
		
	}
	
}
