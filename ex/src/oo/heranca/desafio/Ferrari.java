package oo.heranca.desafio;

public class Ferrari extends Carro{

	@Override
	void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
	
	@Override
	void frear( ) {
		super.frear();
		super.frear();
		super.frear();
	}
}
