package exercicios.controle;

import java.util.Calendar;

public class Ex2 {

	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
	    
		int ano = c.get(Calendar.YEAR) ;
		String bissexto = "";

		if((2016 % 4) == 0 &&  (2016 % 100 != 0)) {
			bissexto = "Ano bissexto e fevereiro possui 29 dias.";
		}else if(ano % 400 == 0) {
			bissexto = "Ano bissexto e fevereiro possui 29 dias.";
		}else
			bissexto = "Ano não é bissexto. ";
			
		System.out.printf("Data %d : %s",ano,bissexto);
		
	}
}
