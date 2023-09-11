package oo.composicao.desafio;


public class Sistema {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.addCompra("Caderno", 10, 10);
		compra1.addCompra("Notbook", 4000,1);

		Compra compra2 = new Compra();
		compra2.addCompra("Caderno", 10, 10);
		compra2.addCompra("Impressora", 1000,1);
		
		Cliente cliente = new Cliente("Ana");
		cliente.addCompra(compra1);
		cliente.addCompra(compra2);
		
		System.out.println(cliente.totalCompra()
				+ "\ncompras1: " + cliente.compra.get(0).totalItens());
		
		for(Compra compras: cliente.compra) {
			for(Item itens: compras.item)
			System.out.println("Compras: "+ itens.totalProduto());
		}
		
		
	}
}
