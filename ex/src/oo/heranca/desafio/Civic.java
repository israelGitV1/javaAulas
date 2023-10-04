package oo.heranca.desafio;

public class Civic extends Carro{

	public Civic(){
		super(212);
	}
	
	@Override
	public void acelerar() {
		super.acelerar();
		super.acelerar();
	}
	
	@Override
	public  void frear(){
		super.frear();
		super.frear();
	}
}
