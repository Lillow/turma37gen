programa
{
	
	funcao inicio()
	{
		inteiro n1 [4][6], n2 [4][6], m1 [4][6], m2 [4][6], l = 0, c = 0

		para (l = 0; l < 4; l++)
		{
			para(c = 0; c < 6; c++)
			{
				escreva("Digite o valor da linha/coluna da 1ª matriz " + (l+1) + "," + (c+1) + ":")
				leia(n1[l][c])
			}
		}
		limpa()
		para (l = 0; l < 4; l++)
		{
			para(c = 0; c < 6; c++)
			{
				escreva("Digite o valor da linha/coluna da 2ª matriz " + (l+1) + "," + (c+1) + ":")
				leia(n2[l][c])
			}
		}
		limpa()
		escreva("A soma dos elementos na mesma posição: \n")
		para (l = 0; l < 4; l++)
		{
			para(c = 0; c < 6; c++)
			{
				m1 [l][c] = n1 [l][c] + n2 [l][c]
				escreva("[" + m1 [l][c] + "]")
			}
			escreva("\n")
		}
		escreva("\n A diferença dos elementos na mesma posição: \n")
		para (l = 0; l < 4; l++)
		{
			para(c = 0; c < 6; c++)
			{
				m2 [l][c] = n1 [l][c] - n2 [l][c]
				escreva("[" + m2 [l][c] + "]")
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
 * @POSICAO-CURSOR = 714; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 10, 2}-{n2, 6, 21, 2}-{m1, 6, 32, 2}-{m2, 6, 43, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */