programa
{
	
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real x1, y1, x2, y2
		real d
		escreva ("x1: ")
		leia (x1)
		escreva ("y1: ")
		leia (y1)
		escreva ("x2: ")
		leia (x2)
		escreva ("y2: ")
		leia (y2)
		d = mat.raiz((mat.potencia((x2 - x1), 2)) + (mat.potencia((y2 - y1), 2)), 2)
		escreva ("O valor de d é: ", d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 310; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */