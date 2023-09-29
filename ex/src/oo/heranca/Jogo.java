package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Monstro mostro = new Monstro();
		mostro.x = 10;
		mostro.y = 10;
		
		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("\n Mostro: "+mostro.vida);
		System.out.println(" Heroi: "+heroi.vida);
		
		mostro.atacar(heroi);
		
		System.out.println("\n Mostro: "+mostro.vida);
		System.out.println(" Heroi: "+heroi.vida);
		
		heroi.atacar(mostro);
		
		System.out.println("\n Mostro: "+mostro.vida);
		System.out.println(" Heroi: "+heroi.vida);
		
	}
}
