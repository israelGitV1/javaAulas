package classe;

import java.util.Date;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome="Pedro Silva";
		u1.email="pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome="Pedro Silva";
		u2.email="pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2);// e igual a false.
		                             // comparando endereçõ de memoria.
		
		System.out.println(u1.equals(u2)); // resultado e false tbm.
		                                   // para retornar verdadeiro tem que implementar o metodo eguals na class Usuario;
	                                       // quanto e implementado a logica no metodo equals retorna true
	    
		System.out.println(u2.equals(new Date())); // como temos a logica no if instanceof Usuario so 
		                                           // instancias de Usuario são comparados.
	}
}
