package utilidades;

import java.util.Scanner;

public class Medias {

	public static void main(String[] args) {
		
		
		double [][] Notas = new double[10][3];
		double mediaAluno=0;
		double MedAlunos[] = new double[10];
		double MedProva[] = new double[3];
		double mediaP=0;

		
		Scanner leia = new Scanner (System.in);
		
		for(int linha=0; linha<10; linha++) 
		{
			for(int coluna = 0; coluna<3; coluna++) 
			{
				System.out.printf("\nDigite a nota %d , do aluno %d", linha, coluna);
				Notas[linha][coluna] = leia.nextDouble();
				mediaAluno +=Notas[linha][coluna];
			}
			mediaAluno /= 3;
			MedAlunos[linha]=mediaAluno;
			System.out.printf("\nA média do aluno %d é de: ", linha, MedAlunos[linha]);
			mediaAluno=0;
			
		}
		
		
		for(int coluna =0; coluna<3; coluna++ ) 
		{
			for(int linha=0; linha<10; linha++) 
			{
				mediaP += Notas[linha][coluna];
			}
			
			mediaP /= 10;
			MedProva[coluna]= mediaP;
			System.out.printf("\nA média da prova %d é de: ", coluna, MedProva[coluna]);
			mediaP =0;
		}
		
		
		
		

	}

}
