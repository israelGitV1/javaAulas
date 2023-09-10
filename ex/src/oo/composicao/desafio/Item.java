package oo.composicao.desafio;


public class Item {

    public int quantidade;
	public Produto produto;
	
	public Item(int quantidade ,Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public String toString() {
		return Double.toString(totalProduto());
	}
	
	public double totalProduto () {
		double total = 0;
		total = quantidade * produto.preco;
		return total;
	}
}
