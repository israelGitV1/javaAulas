package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Main {

	public static void main(String[] args) {
		Carro Ferrari = new Ferrari();
		Carro Civic = new Civic();
		
		System.out.println("Velocidade Ferrari: "+Ferrari.velocidade);
		System.out.println("Velocidade Civic: "+Civic.velocidade);
		
		Ferrari.frear();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		Ferrari.acelerar();
		System.out.println("Velocidade Ferrari: "+Ferrari.velocidade);
		
		Civic.frear();
		Civic.acelerar();
		Civic.acelerar();
		Civic.acelerar();
		System.out.println("Velocidade Civic: "+Civic.velocidade);
		
		Ferrari.frear();
		System.out.println("Velocidade Ferrari: "+Ferrari.velocidade);
		
		Civic.frear();
		System.out.println("Velocidade Civic: "+Civic.velocidade);
		
	}
}
