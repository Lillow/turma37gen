programa
{
	
	funcao inicio()
	{
		const inteiro TAMANHO = 3
		inteiro matriz [TAMANHO][TAMANHO], linha = 0, coluna = 0

		para (linha = 0; linha < TAMANHO; linha++)
		{
			para(coluna = 0; coluna < TAMANHO; coluna++)
			{
				escreva("Digite um valor: ")
				leia(matriz[linha][coluna])
			}
		
		}
		limpa()
		para (linha = 0; linha < TAMANHO; linha++)
		{
			para(coluna = 0; coluna < TAMANHO; coluna++)
			{
				escreva("["+ matriz[linha][coluna]+"]")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */