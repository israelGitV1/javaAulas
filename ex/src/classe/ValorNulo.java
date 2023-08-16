package classe;

public class ValorNulo {
	public static void main(String[] args) {
		
		String s1 = "";		
		System.out.println(s1.concat("!!!!!!"));
		
		Data data= Math.random() > 0.5 ? new Data():null;
		if(data != null) {
			data.mes = 3;// erro não tem como usar atributo ou metodos de variveis que são nulas			
			System.out.println(data.obterDataFormatada());			
		}
		
		String s2 = Math.random() > 0.5 ? "Opa!":null;
		if(s2 != null) {
			System.out.println(s2.concat("!!!!!!"));			
		}
	}
}
