package classe;

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {

		Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
	    p2.desconto = 0.29;
		
	    double precoFinal1 = p1.preco * (1-p1.desconto);
	    double precoFinal2 = p2.preco * (1-p2.desconto);
	    
	    System.out.printf("Média do preço do %s e %s menos desconto R$: %.2f",p1.nome,p2.nome, (precoFinal1 + precoFinal2) / 2);
		entrada.close();
	}
}
