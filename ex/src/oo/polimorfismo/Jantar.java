package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.1);
		
		System.out.println(convidado.getPeso());
		convidado.comoer(ingrediente1);
		convidado.comoer(ingrediente2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sopremesa = new Sorvete(0.4);
		convidado.comoer(sopremesa);
		
		System.out.println(convidado.getPeso());
		
	}
	
}
