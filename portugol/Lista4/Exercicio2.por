programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamentos [10], maior = 0, dado = 0, contMaior = 0
		real media = 0

			para (inteiro i = 0; i < 10; i++)
			{
				lancamentos[i] = Util.sorteia(1, 6)
				escreva ("Lançamento " + (i+1) + ": " + lancamentos [i] + " \n")
				se (lancamentos[i] > maior)
				{
					maior = lancamentos[i]
				}
				media += lancamentos[i]
			}
			para (inteiro i = 0; i < 10; i++)
			{
				se (lancamentos [i] == maior)
				{
					contMaior += 1
				}
			}
			media = media / 10
			escreva ("A média dos valores é " + media + "\n")
			escreva ("O maior valor foi: " + maior + " e ele apareceu " + contMaior + " vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 662; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {lancamentos, 7, 10, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */