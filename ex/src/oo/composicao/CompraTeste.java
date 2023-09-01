package oo.composicao;

import java.util.ArrayList;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra = new Compra();
		compra.cliente = "Lucas";
		compra.itens.add(new Item("Arroz",2 , 17.2));
		compra.itens.add(new Item("Feijão",3 , 10.2));
		
		for(Item item : compra.itens) {
		System.out.println(item.nome);
		System.out.println(item.preco);
		System.out.println(item.quantidade);
		}
		
		System.out.println("Valor total da compra: R$"+ compra.obterValorTotal());
		
		Compra compra2 = new Compra();
		compra2.cliente = "Lucas";
		compra2.adcionarItem(new Item("caderno",2 , 5.2));
		compra2.adcionarItem(new Item("caneta",3 , 10.2));

		System.out.println("Valor total da compra: R$"+ compra2.obterValorTotal());
		
		Compra compra3 = new Compra();
		compra3.cliente = "Gustavo";
		compra3.adcionarItem("mouse",1 , 320);
		compra3.adcionarItem("Nootbook",1 , 4800);

		System.out.println("Valor total da compra: R$"+ compra3.obterValorTotal());
		
		//--------------------------------------------------------------------------
		//Só para mostrar a relação bidirecional!!!
		double total = compra2.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("\n  O total é : R$"+total);
	}
}
