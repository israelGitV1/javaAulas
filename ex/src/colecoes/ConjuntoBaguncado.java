package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" }) // tira o sinal de alerta do Java (O amarelo em baixo da letra)
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);  // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste");  // String
		conjunto.add(1);   // int -> Integer
		conjunto.add('x'); //char -> Caractere
		
		System.out.println("Tamanho é "+conjunto.size()); // tamanho do conjunto 
		
		conjunto.add("teste"); // adiciona por que é diferente
		conjunto.add("Teste"); // não adiciona por que é igual
		System.out.println("Tamanho é "+conjunto.size()); // tamanho do conjunto
		
		System.out.println(conjunto.remove("teste")); // retorna verdadeiro
		System.out.println(conjunto.remove('X'));     // retorna falso
		System.out.println(conjunto.remove('x'));     // retorna verdadeiro
		
		System.out.println("Tamanho é "+conjunto.size()); // "teste" e 'x' foi removido
		
		System.out.println(conjunto.contains('x')); // retorna falso
		System.out.println(conjunto.contains(1.2)); // retorna verdadeiro
		
	
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums); //imprime como String
		System.out.println(conjunto); //imprime como String
		
		//conjunto.addAll(nums); // add conteudo de nums em conjunto
		conjunto.retainAll(nums); // so mandei os valores iguais;
		System.out.println(conjunto); //imprime como String
		
		conjunto.clear(); // limpa tudo
		System.out.println(conjunto);
		
		
	}
}
