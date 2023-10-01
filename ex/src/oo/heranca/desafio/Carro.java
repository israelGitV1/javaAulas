package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADEMAXIMA;
	double velocidade;
	int delta = 5;
	
	Carro(int VelocidadeMaxima){
		this.VELOCIDADEMAXIMA = VelocidadeMaxima;
	}
	void acelerar() {
		if(velocidade + delta > VELOCIDADEMAXIMA) {
			velocidade = VELOCIDADEMAXIMA;
		}
		else {
			velocidade += delta;
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
