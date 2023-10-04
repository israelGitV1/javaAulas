package oo.heranca;

public class Monstro extends Jogador {

	public Monstro(){
		super(0,0);
	}
	
	 public Monstro(int x , int y){
		super(x,y);
	}
	
	public boolean atacar (Jogador openente) {
		boolean atacar1 = super.atacar(openente);
		boolean atacar2 = super.atacar(openente);
		return atacar1 || atacar2;
	}
}
