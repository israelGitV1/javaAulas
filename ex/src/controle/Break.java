package controle;

public class Break {

	public static void main(String[] args) {
		
		for(int i =0; i < 10; i++) {
			
			if(i == 5) 
				break; // para sair do for quanto if for verdadeiro
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}
