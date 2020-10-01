programa
{
	
	funcao inicio()
	{
		// pegar/receber/colher do usuario o nome e manda uma mensage de bom dia
		// colocando sr ou sra conforme a  opcao
		// ingredientes - variaveis
		cadeia nomeUsuario
		caracter opcao
		inteiro anoNascimento
		inteiro idade = 0
		escreva("Digite o seu nome: ")
		leia(nomeUsuario)
		escreva("Digite M - masculino ou F - feminino :")
		leia(opcao)
		escreva("Digite o seu ano de nascimento:")
		leia(anoNascimento)
		idade = 2020 - anoNascimento
		
		se (opcao == 'F' ou opcao =='f' ){
				se(idade >= 60){escreva("Oi "+ nomeUsuario + "! Você é idosa")}
				senao se(idade >= 25){escreva("Oi "+ nomeUsuario + "! Você é madura")}
				senao{escreva("Oi "+ nomeUsuario + "! Você é jovem")
					}
		}
		
		}
		senao se (opcao =='M' ou opcao =='m' ){
				se(idade >= 60){escreva("Oi "+ nomeUsuario + "! Você é idoso")}
				senao se(idade >= 25){escreva("Oi "+ nomeUsuario + "! Você é maduro")}
				senao{escreva("Oi "+ nomeUsuario + "! Você é jovem")
					}
		}
		
		senao {
		 		se(idade >= 60){escreva("Oi "+ nomeUsuario + "! Você é idosx")}
				senao se(idade >= 25){escreva("Oi "+ nomeUsuario + "! Você é madurx")}
				senao{escreva("Oi "+ nomeUsuario + "! Você é jovem")
					}
		}
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 726; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */