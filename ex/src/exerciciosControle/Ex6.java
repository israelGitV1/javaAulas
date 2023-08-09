package exerciciosControle;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		int aleatorio = 10,num;
		boolean estado = false;
		
        System.out.println("Jogo da advinhação "
        		         + "\n Digite um número de 0 ate 100"
        		         + "\n 10 tentativas para acertar o número correto"
        		         +"\n_______________________________________________\n");
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i < 10;i++) {
        	System.out.printf("  Tentativa %d:",i+1);
        	num = entrada.nextInt();
        	if(aleatorio == num) {
        		System.out.printf("\n Parabeins!");
        		estado = true;
        		break;
        	}else if(aleatorio > num) {
        		System.out.printf("   O número digitado é menor (Restantes: %d) \n",10-(i+1));		
        	}else if(aleatorio < num) {
        		System.out.printf("   O número digitado é maior (Restantes: %d) \n",10-(i+1));	          	
        	}
        }
        if(estado == false)
        	System.out.println("Game over! :(");
        entrada.close();
		
	}
}
