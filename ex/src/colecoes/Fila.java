package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>(); 
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
	    System.out.println(fila.peek()); // primeiro elemento da fila sem remover
	    System.out.println(fila.peek()); // se não tiver retorna fila sem remover
	    System.out.println(fila.element());  // se não tiver retorna erro.
	    
	   // fila.clear(); // limpa a fila.

	    System.out.println(fila.isEmpty()); // retorna boolear true se fila esta vazia
	    System.out.println(fila.poll()); // retorna o primeiro elemento e apaga 
	    System.out.println(fila.poll()); // retorna o primeiro elemento e apaga 
	    System.out.println(fila.poll()); // retorna o primeiro elemento e apaga 
	    System.out.println(fila.poll()); // retorna o primeiro elemento e apaga 
	    //System.out.println(fila.poll()); // retorna o primeiro elemento e apaga 
	    // System.out.println(fila.poll()); // retorna o primeiro elemento e apaga 
	    // System.out.println(fila.poll()); // retorna o primeiro elemento e apaga  lista vazia retorna null
	    
	    System.out.println(fila.remove()); // retorna o primeiro elemento e apaga  lista vazia retorna erro
	    
	    // fila.size();
	    // fila.clear();
	    // fila.isEmpty();
	    // fila.contains(...);
	    
	    
	}
}
