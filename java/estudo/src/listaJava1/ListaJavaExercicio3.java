package listaJava1;

import java.util.Scanner;

public class ListaJavaExercicio3 
{
	public static void main(String[] args) 
	{
		/*
		 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto

		 */
		
		int idade = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		
		if(idade < 10) 
		{
			System.out.printf("A sua idade é: %d anos! Sinto muito você é muito jovem para competir!\nMais alguns anos e você estará pronto! ", idade);

		}
		else if(idade >= 10 && idade <15)
		{
			System.out.printf("A sua idade é: %d anos! Você se enquadra na categoria Infantil! ", idade);

		} else if(idade < 18) 
		{
			System.out.printf("A sua idade é: %d anos! Você se enquadra na categoria Juvenil! ", idade);
		}else if(idade < 26) 
		{
			System.out.printf("A sua idade é: %d anos! Você se enquadra na categoria Adulto! ", idade);

		}else 
		{
			System.out.printf("A sua idade é: %d anos! Você não poderá mais competir! \nQue tal jogar por diversão? ", idade);

		}
		
		leia.close();
	}
}
