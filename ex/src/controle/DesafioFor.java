package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor ="#";
		/*for(int i =1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		*/
		// Versão do desafio
		// Não pode usar valor numérico pra controlar o laço!
		
		for(valor = "#";! valor.equals("######");valor += "#") {
			System.out.println(valor);
		}
	}
}
