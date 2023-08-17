package classe;

import java.io.PrintStream;

public class Jantar {

	private static PrintStream printf;

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Lucas",79.8);
		Comida arroz = new Comida("Arroz",0.2);
		Comida carne = new Comida("Carne",0.4);
		
		System.out.println(p1.apresentar());
		p1.Comer(arroz);
		System.out.println(p1.apresentar());
		p1.Comer(carne);
		System.out.println(p1.apresentar());
		
	}
}
