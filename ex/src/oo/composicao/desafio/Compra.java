package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> item;
	
	public Compra(String nome, double preco , int quantidade) {
		this.item = new ArrayList<Item>();
		this.item.add(new Item(quantidade,new Produto(nome, preco)));
	}
	
	public Compra() {
		this.item = new ArrayList<Item>();
	}
	
	public void addCompra(String nome, double preco, int quantidade) {
		this.item.add(new Item(quantidade,new Produto(nome,preco)));
	}
	
	public double totalItens () {
		double total = 0;
		for(Item itens: item) {
			total += itens.totalProduto();
		}
		
		return total;
	}
}
