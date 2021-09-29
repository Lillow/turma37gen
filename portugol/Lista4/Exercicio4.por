programa
{
	
	funcao inicio()
	{
	
		inteiro mat [3][3], l = 0, c = 0, soma = 0, somaDiagonal = 0
		
		para (l = 0; l < 3; l++)
		{
			para (c = 0; c < 3; c++)
			{
				escreva("Digite um valor " + (l+1) + "," + (c+1) +": ")
				leia (mat[l][c])
				soma += mat[l][c]
				se (l == c)
				{
					somaDiagonal += mat [l][c]
				}
			}
		}
		limpa()
		para (l = 0; l < 3; l++)
		{
			para (c = 0; c < 3; c++)
			{
				escreva("[" + mat [l][c] + "]")
				
			}
			escreva("\n")
		}
		escreva("\n A soma de todos os valores é " + soma + " e a soma dos valores da diagonal é " + somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 7, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */