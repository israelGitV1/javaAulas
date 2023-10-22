package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Main {

	public static void main(String[] args) {
		Ferrari Ferrari = new Ferrari();
		Carro Civic = new Civic();
		
		System.out.println("Velocidade Ferrari: "+Ferrari.velocidade);
		System.out.println("Velocidade Civic: "+Civic.velocidade);
		
		
		Ferrari.frear();
		Ferrari.acelerar();
		Ferrari.ligarTurbo();
		Ferrari.acelerar();
		
		System.out.println("Velocidade Ferrari: "+Ferrari.velocidade);
		
		Civic.frear();
		Civic.acelerar();
		Civic.acelerar();
		Civic.acelerar();
		System.out.println("Velocidade Civic: "+Civic.velocidade);
		
		Ferrari.frear();
		System.out.println("Velocidade Ferrari: "+Ferrari.velocidade);
		
		System.out.println("Ar Ferrari: "+Ferrari.getAr());
		Ferrari.ligarAr();
		System.out.println("Ar Ferrari: "+Ferrari.getAr());
		
		Civic.frear();
		System.out.println("Velocidade Civic: "+Civic.velocidade);
		
	}
}
