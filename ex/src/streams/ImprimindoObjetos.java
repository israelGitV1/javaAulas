package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main ( String args[]) {
		
		List<String> aprovados  = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
	    for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
	    System.out.println("\n Usando foreach...");
	    for ( String nome: aprovados) {
	    	System.out.println(nome);
	    }
	    System.out.println("\n Usando Iterator...");
	    Iterator<String> it = aprovados.iterator(); // função do java
	    while(it.hasNext()) { // retorna boolean true se tiver outro elemento na lista ou false ;
	    	 System.out.println(it.next()); // pega o elemento da lista;
	    }
	    
	    System.out.println("\n Usando Stream...");
	    Stream<String> stream = aprovados.stream();
	    stream.forEach(System.out::println); // Laço interno!!!
	    
	    
		
	}
}
