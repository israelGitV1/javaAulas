package oo.heranca.desafio;

public class Ferrari extends Carro{

	
	public Ferrari() {
		super(350);
	}

	@Override
	public void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
	
	@Override
	public void frear( ) {
		super.frear();
		super.frear();
		super.frear();
	}
}
