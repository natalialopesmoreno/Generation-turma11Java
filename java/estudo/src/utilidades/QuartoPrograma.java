package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		String nome;
		int anoNascimento, idade = 0;
		double salario;
		
	//è o equivalente ao leia do portugol
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = scan.next();
		
		
		System.out.print("Digite o seu ano de nascimento: ");
		anoNascimento = scan.nextInt();
		
		
		System.out.print("Digite o seu salário: ");
		salario = scan.nextDouble();
		
		
		idade = 2020 - anoNascimento;
		System.out.printf("Oi %s, sua idade é %d e seu salário é %.2f", nome, idade, salario);
		
		scan.close();

	}

}
