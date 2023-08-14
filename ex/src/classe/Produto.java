package classe;

public class Produto {

	 String nome;
	 double preco;
	 static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial,double preco){
		nome=nomeInicial;
		this.preco= preco;
	}
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 -( desconto + descontoDoGerente));
	}
	
	
}
