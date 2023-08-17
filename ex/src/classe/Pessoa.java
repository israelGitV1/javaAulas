package classe;

public class Pessoa {

	String nome;
	double peso;

	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void Comer(Comida c1) {
		if(c1 != null) {			
			double c= c1.peso;
			this.peso += c;
		}
	}
	
	String apresentar() {
		String str = String.format("%.2f", peso);
		return nome + " têm tenho " + str + " Kgs.";
	}
}
