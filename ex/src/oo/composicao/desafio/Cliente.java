package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

	public String nome;
	ArrayList<Compra> compra;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.compra = new ArrayList<Compra>();
	}
	
	public void addCompra(Compra compra) {
	   this.compra.add(compra);
       
	}
	
	public void addCompra(String nome, double preco, int quantidade) {
		this.compra.add(new Compra(nome,preco,quantidade));
	}
	
	public double totalCompra() {
		double total = 0;
		
		for(Compra compras: compra) {
			total += compras.totalItens();
		}
		return total;
	}
}
