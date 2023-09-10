package oo.composicao.desafio;


public class Sistema {

	public static void main(String[] args) {
		
		Cliente cliente;
		Cliente cliente2;
		Compra compra;
		
		cliente = new Cliente("Israel");
		cliente.addCompra("Notbook Del",7000,1);
		cliente.addCompra("Monitor",1000,1);
		cliente.addCompra("Teclade",300,4);
		cliente.addCompra("Apoio de pé",170,1);
		cliente.addCompra("Cadeira",1200,2);
		
		cliente2 = new Cliente("Gustavo");
		
		compra = new Compra();
		compra.addCompra("NOtbook", 4000, 1);
		compra.addCompra("Mouse",100,2);
		compra.addCompra("Danone",10,5);
        cliente2.addCompra(compra);
        cliente2.addCompra("Tela", 1000, 1);
		
		System.out.println("Cliente: "+cliente.nome
				        +"\nTotal Compra: "+cliente.totalCompra());
		
		for(Compra c : cliente.compra){
			System.out.println(c.totalItens());
			
		}
		
		System.out.println("\n\n\nCliente: "+cliente2.nome
				+"\nTotal Compra: "+cliente2.totalCompra());

		System.out.println("\n\n\nCliente: "+cliente2.nome
				+"\nTotal Compra: "+cliente2.compra.get(1).item.get(0).totalProduto());
		

		
	}
}
