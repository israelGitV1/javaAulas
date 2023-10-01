package oo.heranca.desafio;

public class Ferrari extends Carro{

	
	Ferrari() {
		super(350);
	}

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
