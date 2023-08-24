package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		                                                    // Dentro do maior e menor
		Set<String> listaAprovados = new HashSet<String>(); // o tipo de dado da lista.
		SortedSet<String> listaAprovadosOrdenados = new TreeSet<String>(); // ordena por inserção
		//lista.add(1.2); // erro
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Pedro");
		
		listaAprovadosOrdenados.add("Ana");
		listaAprovadosOrdenados.add("Carlos");
		listaAprovadosOrdenados.add("Lucas");
		listaAprovadosOrdenados.add("Pedro");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		System.out.println("\n\n Lista ordenada por inserção");
		
		for(String cadidatosOrdenados : listaAprovadosOrdenados) {
			System.out.println(cadidatosOrdenados);
		}
		
		System.out.println("\n\n Lista numeros");
		
		Set<Integer> num = new HashSet<Integer>();
		num.add(1);
		num.add(2);
		num.add(120);
		num.add(6);
		
		for(int n:num) {
			System.out.println(n);
		}
		
	}
}
