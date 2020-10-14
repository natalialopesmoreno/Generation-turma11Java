package classes;

import java.util.Scanner;

public class ProfessoreMain 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		Professor Professor1 = new Professor();
		Professor Professor2 = new Professor();
		Professor Professor3 = new Professor();
		
		System.out.print("Digite seu nome:");
		Professor1.nome = leia.next();
		System.out.print("Digite seu ano de nascimento:");
		Professor1.anoNascimento = leia.nextInt();
		Professor1.idade = 2020 - Professor1.anoNascimento;
		System.out.print("\nDigite a disciplina que leciona:");
		Professor1.disciplina = leia.next();
		System.out.print("Digite o número de aulas que leciona:");
		Professor1.qtdAulas = leia.nextInt();
		
		System.out.printf("\nOlá, você é o prof. %s, você tem %d anos de idade, leciona %d aulas da disciplina de  %s!  ", Professor1.nome, Professor1.idade, Professor1.qtdAulas, Professor1.disciplina );
		
		System.out.print("\nDigite seu nome:");
		Professor2.nome = leia.next();
		System.out.print("Digite seu ano de nascimento:");
		Professor2.anoNascimento = leia.nextInt();
		Professor2.idade = 2020 - Professor2.anoNascimento;
		System.out.print("Digite a disciplina que leciona:");
		Professor2.disciplina = leia.next();
		System.out.print("Digite o número de aulas que leciona:");
		Professor2.qtdAulas = leia.nextInt();
		
		System.out.printf("\nOlá, você é o prof. %s, você tem %d anos de idade, leciona %d aulas da disciplina de  %s!  ", Professor2.nome, Professor2.idade, Professor2.qtdAulas, Professor2.disciplina );

		
		System.out.print("\nDigite seu nome:");
		Professor3.nome = leia.next();
		System.out.print("Digite seu ano de nascimento:");
		Professor3.anoNascimento = leia.nextInt();
		Professor3.idade = 2020 - Professor3.anoNascimento;
		System.out.print("Digite a disciplina que leciona:");
		Professor3.disciplina = leia.next();
		System.out.print("Digite o número de aulas que leciona:");
		Professor3.qtdAulas = leia.nextInt();
		
		System.out.printf("\nOlá, você é o prof. %s, você tem %d anos de idade, leciona %d aulas da disciplina de  %s!  ", Professor3.nome, Professor3.idade, Professor3.qtdAulas, Professor3.disciplina );

		Aluno aluno = new Aluno();
		System.out.print("\nDigite o nome do aluno:");
		aluno.nome = leia.next();
		System.out.print("Digite seu ano de nascimento:");
		aluno.anoNascimento = leia.nextInt();
		aluno.idade = 2020 - aluno.anoNascimento;
		System.out.print("Digite o curso o qual pertence:");
		aluno.curso = leia.next();
		System.out.print("Digite o valor da sua nota:");
		aluno.nota = leia.nextDouble();
		
		System.out.printf("\nOlá, você é o aluno "+aluno.nome+" , você tem "+ aluno.idade+" anos de idade, pertence ao curso " + aluno.curso );
		
		if(aluno.nota>=5) 
		{
			System.out.printf("\nSua nota é: "+aluno.nota+"! Você foi aprovado!");
		}else 
		{
			System.out.printf("\nSua nota é: "+aluno.nota+"! Você foi reprovado!");

		}

		
		
		
	}

}
