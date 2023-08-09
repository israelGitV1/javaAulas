package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "Bom dia X";
		s = s.toUpperCase();// metodo para maiusculo
		s = s.replace("X", "Senhora");// metodo para mudar String
		s = s.concat("!!!");// medoto que adiciona no final da String
		
		
		System.out.println(s);
		
		System.out.println(s.toUpperCase()); // metodo so valido na impresão;
		
	    String x = "Leo".toUpperCase();
	    System.out.println(x);
	    
	    String y = "Bom dia X".replace("X", "Gui")
	    		              .toLowerCase() // dois metodos juntos
	                          .concat("!!!");// pode concatenar quantos quiser desde que mantenha no mesmo tipo (.length()) geraria um erro
	    System.out.println(y);
	    
	    //Tipos primitivos não tem o operador "."
	    //Tipos primitivos não tem metodos
	}
}
