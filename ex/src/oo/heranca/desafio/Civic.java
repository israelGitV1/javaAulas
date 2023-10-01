package oo.heranca.desafio;

public class Civic extends Carro{

	Civic(){
		super(212);
	}
	
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
