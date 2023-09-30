package oo.heranca;

public class Monstro extends Jogador {

	Monstro(){
		super(0,0);
	}
	
	Monstro(int x , int y){
		super(x,y);
	}
	
	boolean atacar (Jogador openente) {
		boolean atacar1 = super.atacar(openente);
		boolean atacar2 = super.atacar(openente);
		return atacar1 || atacar2;
	}
}
