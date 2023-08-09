package fundamentos;

public class tipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));//mostra apenas o char na posição 2
		
		String s = "Boa tarde";
		s = s.toUpperCase();// maiúsculo
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("BOA"));//retorna booleano
		System.out.println(s.toLowerCase().startsWith("boa"));// retorna booleano
		System.out.println(s.endsWith("dia"));//retorna booleano
		System.out.println(s.length());//tamanho do vertor de strings
		s = "Boa tarde";
		System.out.println("\n"+s.equals("boa tarde"));// equals compara String
		System.out.println(s.equals("Boa tarde"));//equals compara String
		System.out.println(s.equalsIgnoreCase("boa tarde"));// compara strings inginorando maiusculas de minusculas
		
		var nome = "Pedro";// Inferencia (variavel sera do tipo que foi iniciada e não podera mudar);
		var sobrenome = "Santos";
		var idade =33;
		var salario = 12345.987;
		
		System.out.println("\nNome: "+ nome 
				          + "\nSobernome: "
				          + "\nIdade:"
				          + idade
				          + "\nSalario: " 
				          +salario+"\n\n");
		System.out.printf("Nome: %s %s tem %d e ganha R$%.2f",nome,sobrenome,idade,salario);// forma de print Formatada %s= String , %d inteiro , %f real
		                                           // %f numero real completo 
                                                   // %.2f formatado com 2 casas decimais
	
		String frase = String.format("\n"
				+ "\nNome: %s %s tem %d e ganha R$%.2f",nome,sobrenome,idade,salario);
	    System.out.println(frase);  // formatando a String em uma variavel          
	    
	    System.out.println("Pesqui: israel".contains("israel"));// retorna um booleano se conter na Array de Strings
	    System.out.println("Frase qualquer".indexOf("qual"));
	    System.out.println("Frase qualquer".substring(6)); // get String all
	    System.out.println("Frase qualquer".substring(6, 10));//get String ate
	}                                                
}
