package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto"); // add e substitui elemento no map
		usuarios.put(1, "Ricardo"); // alterado
		usuarios.put(2, "Carlos");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size()); // retorna o tamanho do map
		System.out.println(usuarios.isEmpty()+ "\n"); // se o mapa n tiver nem uma key retorna true se não false
		
		System.out.println(usuarios.keySet()); // retorna todas as key (chaves) do map
		System.out.println(usuarios.values()); // retorna todos os valores (conteudo) do map
		System.out.println(usuarios.entrySet()+ "\n"); // retorna key e valores do map
		
		System.out.println("\n"+usuarios.remove(2)); // remove pela key
		System.out.println(usuarios.remove(4 , "Gui")+ "\n");  //remove pela key e value se não tiver retorna false
		
		System.out.println(usuarios.containsKey(20)); // retorna boolean true se tiver no map
		System.out.println(usuarios.containsValue("Rebeca")+"\n"); // retorna boolean true se tiver no map
		
		System.out.println(usuarios.get(3)); // retorna o elemento do map com a key = 3;
		System.out.println(usuarios.get(2) + "\n"); // retorna o elemento do map com a key (se não encontrar retorna null)
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);    //percorre o map pela key montrando todo o map
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);    //percorre o map pela value montrando todo o map
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey()+ " ==> ");     // percorre o map por key e value
			System.out.println(registro.getValue());
		}
	}
}
