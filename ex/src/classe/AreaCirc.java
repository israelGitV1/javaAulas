package classe;

public class AreaCirc {

	double raio;
	static final double PI = 3.14; // static um unico valor para todos os objetos da class
	                               // final para a variável não ser modificada;
	                               // 'PI' maiúsculo para identificação de boas práticas
	AreaCirc(double raio){
		this.raio = raio;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
		
	}
}
