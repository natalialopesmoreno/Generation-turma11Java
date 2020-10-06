package lista1exercicios;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner(System.in);
		
		int totalSegundos; 
		int tempoHoras=0 ;
		int tempoMinutos=0;
		int tempoSegundos=0 ;
		int restoHoras=0 ;
		int restoMinutos=0;
		
		System.out.println("Informe o tempo total em segundos: ");
		totalSegundos = leia.nextInt();
		
		
		restoHoras = totalSegundos % 3600;
		tempoHoras = (totalSegundos- restoHoras)/3600;
		restoMinutos = restoHoras % 60;
		tempoMinutos = (restoHoras-restoMinutos)/60;
		tempoSegundos = restoMinutos;
		
		System.out.println("O tempo em total é de: " + tempoHoras + " hora(s) " + tempoMinutos+ " minuto(s) " + tempoSegundos + " segundo(s) ");
		
		leia.close();
				

	}

}
