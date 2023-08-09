package exercicios;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;// declaração e inicialização
		System.out.println(a);
		
		//a = "..."; Error
		
		var b = 4.5;// var cria uma variável do tipo iniciado
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		//c= 4.5; Error
		
		double d;// variável foi declarada
		d = 123.65;//variável foi inicializada
		System.out.println(d);// usada!
	}
}
