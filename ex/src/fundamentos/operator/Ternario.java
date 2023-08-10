package fundamentos.operator;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "Recuperação";
   //   tipo        nomeVariavel condição  ?  verdadeiro : falso
		System.out.println("O aluno está " + resultadoFinal);
		
		// exemplo 2
		
		double nota = 9.9;
		boolean bomComportamento =false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("tem desconto? "+ resultado);
		
	}
	
}
