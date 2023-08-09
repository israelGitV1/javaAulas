package controle;

public class For1 {

	public static void main(String[] args) {
		int contador =0;
		System.out.println("While");
		while(contador <= 10) {
			System.out.printf("contador = %d\n", contador);
		    contador++;
		}
		System.out.println("For");
		for(contador = 0; contador <= 10;contador++) {
			System.out.printf("Contador = %d\n", contador);
		}
		
		// Laço infinito!!!
		//for(;;) {
		//	System.out.println("Fim!");
		//}
	}
}
