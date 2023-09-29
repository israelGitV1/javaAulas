package oo.heranca.desafio;

public class Carro {

	double velocidade;
	
	void acelerar() {
		if(velocidade >= 0) {
			velocidade += 5;
		}
	}
	
	void frear() {
		if(velocidade > 0 ) {
			velocidade -=5;
		}
	}
	
}
