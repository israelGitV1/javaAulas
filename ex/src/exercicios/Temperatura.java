package exercicios;

public class Temperatura {
	public static void main(String [] args) {
		//(F - 32) x 5/9 = C
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
        
		double tempF =0;
        double tempC = (tempF - AJUSTE) * FATOR;
        
       System.out.println("Resultado: "+tempC);
        
	}
}
