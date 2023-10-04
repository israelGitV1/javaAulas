package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADEMAXIMA;
	public double velocidade;
	public int delta = 5;
	
	public Carro(int VelocidadeMaxima){
		this.VELOCIDADEMAXIMA = VelocidadeMaxima;
	}
	public void acelerar() {
		if(velocidade + delta > VELOCIDADEMAXIMA) {
			velocidade = VELOCIDADEMAXIMA;
		}
		else {
			velocidade += delta;
		}
	}
	
	public void frear() {
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
