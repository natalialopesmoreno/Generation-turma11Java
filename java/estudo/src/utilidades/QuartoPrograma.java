package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		String nome;
		int anoNascimento, idade = 0;
		double salario;
		
	//� o equivalente ao leia do portugol
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = scan.next();
		
		
		System.out.print("Digite o seu ano de nascimento: ");
		anoNascimento = scan.nextInt();
		
		
		System.out.print("Digite o seu sal�rio: ");
		salario = scan.nextDouble();
		
		
		idade = 2020 - anoNascimento;
		System.out.printf("Oi %s, sua idade � %d e seu sal�rio � %.2f", nome, idade, salario);
		
		scan.close();

	}

}
