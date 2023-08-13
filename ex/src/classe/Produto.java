package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial,double preco,double desconto){
		nome=nomeInicial;
		this.preco= preco;
		this.desconto = desconto;
	}
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto+descontoDoGerente);
	}
	
}
