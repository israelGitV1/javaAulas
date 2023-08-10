package fundamentos.operator;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b); // igualdade
		
		System.out.println(3 > 4); // maior
		System.out.println(3 >= 3); // maior igual
		System.out.println(3 < 7);  // menor
		System.out.println(3 != 7); //diferente menor
		
		double nota = 7.3;
		boolean bomComportamento = true;  
		boolean passouPorMedia = nota >= 7; // maior igual
	    boolean temDesconto = bomComportamento && passouPorMedia; // conparador End 
	    
	    System.out.println("Tem desconto? "+ temDesconto);
	}
	
}
