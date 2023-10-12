package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobreNome;
	private int idade;
	
	public Pessoa(String nome,String sobreNome,int idade) {
		setIdade(idade);
		setNome(nome);
		setSobreNome(sobreNome);
	}
	
	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade >= 0 && idade <= 120) {
		this.idade = idade;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Olá eu sou o " + getNome() + " tenho " + getIdade() + " anos. ";
	}
}
