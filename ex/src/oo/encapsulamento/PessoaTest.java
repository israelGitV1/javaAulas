package oo.encapsulamento;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Israel","Freitas",-45); 
//		p1.idade = -30; //Alterar
		p1.setIdade(121);//Alterar
		
//		System.out.println(p1.idade); //Ler
		System.out.println(p1.getIdade()); //Ler
		System.out.println(p1); //toString
	}
}
