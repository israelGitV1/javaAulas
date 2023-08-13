package classe;

import java.util.Scanner;

public class MainProduto {
	
	public static void main (String[]args) {

		Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto("Notebook",4356.89,0.25);
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
	    p2.desconto = 0.29;
		
	    double precoFinal1 = p1.precoComDesconto();
	    double precoFinal2 = p2.precoComDesconto(0.1);
	    
	    System.out.printf("Média do preço do %s e %s menos desconto R$: %.2f",p1.nome,p2.nome, (precoFinal1 + precoFinal2) / 2);
		entrada.close();
	}
}
