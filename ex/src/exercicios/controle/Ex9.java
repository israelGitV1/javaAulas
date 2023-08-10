package exercicios.controle;

import java.util.Scanner; 
public class Ex9 {

	public static void main(String[] args) {
		int num,maiorNum=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 10 números o sistema retornara o maior");
		for(int i = 0;i<10;i++) {
			System.out.printf("%d Número:",i+1);
			num = entrada.nextInt();
			if(num > maiorNum)
				maiorNum =num;
		}
		System.out.println("Maior Número digitado: "+maiorNum);
		entrada.close();
	}
}
