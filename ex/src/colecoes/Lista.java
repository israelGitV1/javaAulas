package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
	
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Israel");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lisa"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu")); // Aceita obj. duplicado.
		
		System.out.println(lista.get(3).nome); // acessar pelo índice.
		
		System.out.println("Remove ("+lista.remove(1)+")"); 
		// remove elemento da lista pelo índice.
		// metodo remove pelo índice retorna o objeto.
		
		System.out.println("Remove ("+lista.remove(new Usuario("Manu"))+")"); 
		System.out.println("Remove ("+lista.remove(new Usuario("Manu"))+")"); 
		System.out.println("Remove ("+lista.remove(new Usuario("Manu"))+")"); 
		// remove elemento pelo objeto.
		// metodo remove retorna um boolean.
		
		System.out.println("Contains ("+lista.contains(new Usuario("Lisa"))+")");
		// retorna verdadeiro se a lista tiver o objeto.
		
		
		for(Usuario us : lista) {
			System.out.println(us.nome );
		}
		
		System.out.println();
		
		for(Usuario us : lista) {
			System.out.println(us);
		}

	}
}
