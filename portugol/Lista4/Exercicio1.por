programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		real vetor [5], maior = 0

		para (inteiro i = 0; i < u.numero_elementos(vetor); i++)
		{
			escreva("Digite o " + (i + 1) + "º valor: ")
			leia(vetor[i])

			se (vetor[i] > maior)
			{
				maior = vetor[i]
			}
		}
		escreva("A maior pontuação foi " + maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */