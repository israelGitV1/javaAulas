package colecoes;

import java.util.Objects;

public class Usuario {
	
	String nome;
	
	Usuario (String nome){
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Meu nome é " + this.nome + ".";  // quando a classe e chamada será impreso isso na tela.
	}

	@Override
	public int hashCode() {                 // metodo hashCode() e
		return Objects.hash(nome);          // metodo equals permite que o java compare objetos.
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}
