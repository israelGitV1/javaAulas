package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionario
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;// o "L" no final o codigo entende que o numero e um log
	
		///Tipos numéricos reais
		float salario = 11_445.44F;// "F" de float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo boolean
		boolean estaDeFerias = false;//true quando não declara nada;
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empres
	
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println("ID:"+id +": ganha ->"+ salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: "+ status);
	}
}
