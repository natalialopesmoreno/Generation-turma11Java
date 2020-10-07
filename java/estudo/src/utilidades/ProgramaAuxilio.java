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
		
		System.out.print("Voc� � chefe de fam�lia? -  Sim ou N�o? ");
		chefeFamilia= scan.next().toUpperCase().charAt(0);
		//System.out.println(chefeFamilia == 'S');
		
		System.out.print("Qual o seu sexo? - M masculino ou F feminino? ");
		sexo = scan.next().toUpperCase().charAt(0);
		//System.out.println(sexo == 'M');
		
		if((2020-anoNascimento >= 18) && chefeFamilia == 'S'  && sexo == 'M')
		{
			System.out.println("Ol� senhor " +nome+"\nVoc� receber� R$600,00 de aux�lio emergencial!");
		} else if( (2020-anoNascimento >= 18) && chefeFamilia == 'S' && sexo == 'F')
		{
			System.out.println("Ol� senhora " +nome+"\nVoc� receber� R$1200,00 de aux�lio emergencial!");

		}else if((chefeFamilia == 'N')) 
		{
			System.out.println("Voc� n�o � chefe de fam�lia! Voc� n�o tem direito ao aux�lio");

		}else if(!(2020-anoNascimento >= 18))
		{
			System.out.println("Voc� ainda � menor de idade! Voc� n�o tem direito ao aux�lio!");
		}
		 
		else 
		{
			System.out.println("Op��o inv�lida! At� logo!");
		}
		
		
		scan.close();
		

	}

}
