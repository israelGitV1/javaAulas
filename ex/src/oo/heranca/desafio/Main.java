package oo.heranca.desafio;

public class Main {

	public static void main(String[] args) {
		Carro Ferrari = new Ferrari();
		Carro Civic = new Civic();
		
		System.out.println("Velocidade Ferrari: "+Ferrari.velocidade);
		System.out.println("Velocidade Civic: "+Civic.velocidade);
		
		Ferrari.frear();
		Ferrari.acelerar();
		System.out.println("Velocidade Ferrari: "+Ferrari.velocidade);
		
		Civic.frear();
		Civic.acelerar();
		System.out.println("Velocidade Civic: "+Civic.velocidade);
		
		Ferrari.frear();
		System.out.println("Velocidade Ferrari: "+Ferrari.velocidade);
		
		Civic.frear();
		System.out.println("Velocidade Civic: "+Civic.velocidade);
		
	}
}
