programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{		
			
		   real nota1, nota2, nota3, media
		   escreva ("Digite a 1ª nota: ")
		   leia (nota1)
		   escreva ("Digitee a 2ª nota: ")
		   leia (nota2)
		   escreva ("Digite a 3ª nota: ")
		   leia (nota3)
		   media = mat.arredondar(((nota1 *2 ) + ( nota2 * 3 ) + (nota3*5)) / 10, 2)
		   escreva ("A média ponderada é ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */