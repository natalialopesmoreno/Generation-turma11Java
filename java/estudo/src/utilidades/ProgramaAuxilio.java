package utilidades;

import java.util.Scanner;

public class ProgramaAuxilio {

	public static void main(String[] args) {
		
		String nome;
		int anoNascimento;
		char chefeFamilia;
		char sexo; 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Qual o seu ano de nascimento: ");
		anoNascimento = scan.nextInt();
		//System.out.println(2020-anoNascimento >= 18);
		
		System.out.print("Qual o seu nome: ");
		nome = scan.next();
		
		System.out.print("Você é chefe de família? -  Sim ou Não? ");
		chefeFamilia= scan.next().toUpperCase().charAt(0);
		//System.out.println(chefeFamilia == 'S');
		
		System.out.print("Qual o seu sexo? - M masculino ou F feminino? ");
		sexo = scan.next().toUpperCase().charAt(0);
		//System.out.println(sexo == 'M');
		
		if((2020-anoNascimento >= 18) && chefeFamilia == 'S'  && sexo == 'M')
		{
			System.out.println("Olá senhor " +nome+"\nVocê receberá R$600,00 de auxílio emergencial!");
		} else if( (2020-anoNascimento >= 18) && chefeFamilia == 'S' && sexo == 'F')
		{
			System.out.println("Olá senhora " +nome+"\nVocê receberá R$1200,00 de auxílio emergencial!");

		}else if((chefeFamilia == 'N')) 
		{
			System.out.println("Você não é chefe de família! Você não tem direito ao auxílio");

		}else if(!(2020-anoNascimento >= 18))
		{
			System.out.println("Você ainda é menor de idade! Você não tem direito ao auxílio!");
		}
		 
		else 
		{
			System.out.println("Opção inválida! Até logo!");
		}
		
		
		scan.close();
		

	}

}
