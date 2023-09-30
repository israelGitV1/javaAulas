package oo.heranca.desafio;

public class Civic extends Carro{

	@Override
	void acelerar() {
		super.acelerar();
		super.acelerar();
	}
	
	@Override
	void frear(){
		super.frear();
		super.frear();
	}
}
