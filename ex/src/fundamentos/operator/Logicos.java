package fundamentos.operator;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);// e
		System.out.println(condicao1 || condicao2);//ou
		System.out.println(condicao1 ^ condicao2);//xor
		System.out.println(!!condicao1);// dubla negação
		System.out.println(!condicao2);// negação
		
		System.out.println("\nTabale verdade E");
		System.out.println(true  && true);
		System.out.println(true  && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\nTabale verdade Ou");
		System.out.println(true  || true);
		System.out.println(true  || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabale verdade NOT");
		System.out.println(!true );
		System.out.println(!true );
		System.out.println(!false);
		System.out.println(!!false);
	}
}
