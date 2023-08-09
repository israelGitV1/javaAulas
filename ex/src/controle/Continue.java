package controle;

import java.util.Iterator;

public class Continue {

	public static void main(String[] args) {
		
		for (int i=0; i< 10; i++) {
			if(i % 2 == 1) {
				continue; // volta para o inicio do for quando
				          // entra no if
			}
			System.out.println(i);
		}
		
		System.out.println("\n\n");
		
		for (int i=0; i< 10; i++) {
			if(i == 5) {
				continue; // volta para o inicio do for quando
				          // entra no if
			}
			System.out.println(i);
		}
			
	}
}
