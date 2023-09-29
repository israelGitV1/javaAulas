package oo.heranca;

public class Monstro extends Jogador {

	boolean atacar (Jogador openente) {
		boolean atacar1 = super.atacar(openente);
		boolean atacar2 = super.atacar(openente);
		return atacar1 || atacar2;
	}
}
