package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
	
		livros.add("O pequeno príncipe"); //se add ou não retorna verdadeiro ou falso
		livros.push("Don Quixote");
		livros.push("O Hobbit"); 
		
		
		System.out.println(livros.peek());      // retoran o ultimo elemento da pilha
		System.out.println(livros.element()+"\n");   // retoran o ultimo elemento da pilha
		
		for(String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println("\n"+livros.element());     // se não tiver retorna erro
		System.out.println(livros.peekLast());  // retorna o primeiro elemento da pilha
		System.out.println(livros.peekFirst()+"\n"); // retorna o ultimo elemento da pilha
		
		System.out.println(livros.size()); // mostra o tamanho
		//livros.clear();
		System.out.println(livros.size()); // ...
		
		System.out.println(livros.pop()); //  montra o primeori elemento e remove e retorna erro se não tiver elementos
		System.out.println(livros.remove()); // montra o primeori elemento e remove e retorna erro se não tiver elementos
		System.out.println(livros.poll()+"\n"); //  montra o primeori elemento e remove e retorna null se não tiver elementos
		
		System.out.println(livros.size()); // ...
		System.out.println(livros.contains("O")); // ... se contem o elemento boolean
		System.out.println(livros.isEmpty());
		
		
	}
}
