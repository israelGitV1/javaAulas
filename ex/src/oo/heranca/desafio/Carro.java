package oo.heranca.desafio;

public class Carro {

	double velocidade;
	
	
	void acelerar() {
		if(velocidade >= 0) {
			velocidade += 5;
		}
	}
	
	void frear() {
		if(velocidade >= 5 ) {
			velocidade -=5;
		}else {
			velocidade = 0;
		}
	}
	
	public String toString() {
		return "Velocidade Atual é : "+velocidade + "Km/h.";
	}
	
}
