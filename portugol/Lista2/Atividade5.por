programa
{
	
	funcao inicio()
	{
		real indice
		escreva("Ímdice de poluição: ")
		leia (indice)
		se (indice<= 0.25){
			escreva("Índice aceitável.")
		}
		senao se(indice <= 0.3){
			escreva("1º GRUPO SUSPENDAM SUAS ATIVIDADES!!!")	
		}
		senao se(indice <= 0.4){
			escreva("1º E 2º GRUPOS SUSPENDAM SUAS ATIVIDADES!!!")	
		}
		senao{
			escreva("TODOS OS GRUPOS SUSPENDAM AS SUAS ATIVIDADES!!!")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */