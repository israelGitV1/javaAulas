package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo , Luxo{

	private boolean ar = false;
	
	public Ferrari() {
		super(350);
	}

	@Override
	public void acelerar() {
		super.acelerar();
		delta = 15;
	}
	
	@Override
	public void frear( ) {
		super.frear();
		delta = 15;
	}

	@Override
	public void ligarTurbo() {
		delta = 35;
		
	}

	@Override
	public void desligarTurbo() {
		delta = 15;
	}
    
	@Override
	public void ligarAr() {
		ar = true;
	}

	@Override
	public void desligarAr() {
		ar = false;
	}
	
	public boolean getAr() {
		return ar;
	}
}
