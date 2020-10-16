package listaJava5Polimorfismo;

public class Exercicio1
{
public static void main(String[] args) {
	

	/*
	 * Crie uma hierarquia de classes 
	 * conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
	 *  Animal:
	 *  
	 *  Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio anterior e 
	 *  invoque o m�todo que emite o som de cada um de forma polim�rfica, isto �, independente do tipo de animal.
	 */
	
	//POLIMORFISMO CRIANDO COMO ANIMAIS CADA CLASSE FILHA E O PROGRAMA BUSCA OS M�TODOS QUE EST�O SOBRESCRITOS ESPEC�FICAS DE CADA ANIMAL
	Animal cachorro = new Cachorro();
	cachorro.setNome("cachorrinho");
	cachorro.setIdade(5);
	cachorro.emitirSom();
	
	Animal cavalo = new Cavalo();
	cavalo.setNome("cavalinho");
	cavalo.setIdade(2);
	cavalo.emitirSom();
	
	
	Animal preguica = new Preguica();
	preguica.setNome("Preguicinha");
	preguica.setIdade(25);
	preguica.emitirSom();
	
	
	
	//Para eu utilizar um m�todo que s� tem na classe pregui�a n�o posso instanciar como animal
	Preguica preguica1 = new Preguica();
	preguica1.setNome("Preguicinha espec�fica");
	preguica1.setIdade(25);
	preguica1.emitirSom();
	preguica1.subirArvore();
	
	
	
}
}
