programa
{
	
	funcao inicio()
	{ 
		inteiro numero
		escreva("Digite um número positivo e inteiro para saber se ele é par ou ímpar: ")
		leia (numero)

		se (numero < 0){
			escreva("O número é negativo. Digite outro.\n")
		}
		senao se (numero == 0){
			escreva("O número é neutro. \n")
		}
		senao{
			se(numero % 2 ==0){
				escreva ("O número ", numero, " é par.")
			}
			senao{
				escreva ("O número ", numero, " é ímpar.")
				}
		}
		
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */