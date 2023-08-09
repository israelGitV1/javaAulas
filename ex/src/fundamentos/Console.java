package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Imprime na Tela sem Pular linha");
		System.out.println("Imprime na Tela Pulando linha ");
		System.out.println("/n a barra invertida + n (/n) pula linha");
		
		System.out.printf("Mensagem formatada numero:%d string:%s",22,"israel");
		System.out.printf("Salário: %.1f%n",1234.56789);
		
		Scanner entrada = new Scanner(System.in); // entrada pelo teclado (import Scanner)
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();// o que o usuario escrever vai para variavel nome
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();// entrada de numero ( Para todos os tipos o scanner correto)
		
		entrada.nextLine();//para limpar o /n do nextInt()
		
		System.out.print("Cidade: ");
		String cidade = entrada.nextLine();
		
		System.out.printf("%s tem %d anos e mora na cidade: %s",nome,idade,cidade);// monstra nome na Tela
		entrada.close(); // fecha o Scanner para economizar memoria
	}
}
