package controle;

import java.util.Scanner;

public class DesafioWhile {
	//entrada de nota valida
	//somas notas
	//numero de notas totais salvo em uma variavel
	//todo em um loop -1 para sair do loop
	//sai do loop e  calcula a media
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0,somaNota = 0,media;
		int contNota=0;
		
		while(nota != -1) {
			System.out.print("Digite uma nota(-1 p/Sair): ");
			nota = entrada.nextDouble();
			if(nota <=10 && nota >= 0) {
			somaNota +=nota;
			contNota++;
			}else if(nota != -1) {
				System.out.println("Nota inválida!!! ;D");
			}
		}
		 
		media = somaNota/contNota;
		System.out.printf("Media: %.1f somaNota: %.1f contNota: %d",media,somaNota,contNota);
		
		entrada.close();
	}
}
