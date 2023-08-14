package classe;

import java.util.Scanner;

public class MainProduto {
	
	public static void main (String[]args) {

		Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto("Notebook",4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
	   
	    double precoFinal1 = p1.precoComDesconto();
	    double precoFinal2 = p2.precoComDesconto(0.1); // Desconto normal mais o desconto do gerente
	    
	    System.out.println("Valor do desconto: "+Produto.desconto * 100 + '%');
	    System.out.printf("%s valor: %.2f \n",p1.nome,p1.preco);
	    System.out.printf("%s valor com desconto: %.2f \n",p1.nome,precoFinal1);
	    
	    System.out.printf("%s valor: %.2f \n",p2.nome,p2.preco);
	    System.out.printf("%s valor com desconto(somado com o desconto do gerente): %.2f \n",p2.nome,precoFinal2);
	    
	    System.out.printf("Média do preço do %s e %s menos desconto R$: %.2f",p1.nome,p2.nome, (precoFinal1 + precoFinal2) / 2);
		entrada.close();
	}
}
