package utilidades;

import java.util.Scanner;

public class ExercicoArray {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String [] alunos = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto", "Jonas De Oliveira Santos", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "Mônica dos santos ribeiro", "Natália Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corrêa", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		int [][] notas = new int[alunos.length][5];
		int codigoAluno = 1;
		char opc= 'S';
		int nota =0;
		int bimestre;
		
		/*Imprimir código, nota e nome;
		 * escolha uma pessoa 
		 * vc escolheu fulano digite sua nota
		 * vc quer continuar?
		 * 
		 * imprimir todos os nomes e notas
		 */
		
		
		System.out.printf("NOTA 1ºbimestre -------NOTA 1ºbimestre -------NOTA 2ºbimestre --------------NOTA 3ºbimestre --------------NOTA 4ºbimestre ---------------------NOTA 5ºbimestre                       CÓDIGO                   ALUNO              \n");
		for(int x =0; x< alunos.length; x++)
		{
			System.out.printf("                          "+ notas[x][0]+"----------------------------"+ notas[x][1]+"----------------------------"+ notas[x][2]+"----------------------------"+ notas[x][3]+"----------------------------"+ notas[x][4]+"----------------------------"+ "                 "+ x+  "               "+ alunos[x]+"\n");
		}
		
		while(opc != 'N') 
		{
			System.out.print("\nQual aluno você deseja inserir a nota?: digite o código");
			codigoAluno = leia.nextInt();
			System.out.print("\nNota de qual bimestre?");
			bimestre = leia.nextInt();
			
			System.out.printf("\nO alunx que você escolheu é %s! Qual a sua nota?:",alunos[codigoAluno] );
			nota = leia.nextInt();
			
			notas[codigoAluno][bimestre] = nota;
			
			
			System.out.println("\nVocê deseja continuar? S- sim ou N- não?");
			opc = leia.next().toUpperCase().charAt(0);
			
			
		}
		
		System.out.printf("CÓDIGO   ALUNO   NOTA   \n");
		for(int x =0; x< alunos.length; x++)
		{
			System.out.printf(x +"   "+ alunos[x]+ "        "+ notas[x]+"\n");
		}
		
		
		
		
		
	}

}
