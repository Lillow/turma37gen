programa
{
	
	funcao inicio()
	{
		inteiro dias, totalAnos, totalMeses, totalDias
		escreva("Dias: ")
		leia (dias)
		totalAnos = dias / 365
        	totalMeses = (dias % 365) / 30
        	totalDias = (dias % 365) % 30
        	escreva ("Você tem ", totalAnos, " anos ", totalMeses, " meses e ", totalDias, " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */