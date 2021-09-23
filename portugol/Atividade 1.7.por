programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a, b, c, d, ee, f, x, y
		escreva ("a: ")
		leia (a)
		escreva ("b: ")
		leia (b)
		escreva ("c: ")
		leia (c)
		escreva ("d: ")
		leia (d)
		escreva ("e: ")
		leia (ee)
		escreva ("f: ")
		leia (f)
		x = mat.arredondar((c * ee - b * f) / (a * ee - b * d), 2)
		y = mat.arredondar((a * f - c * d) / (a * ee - b * d), 2)
		escreva ("O valor de x é ", x, " e o valor de y é ", y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 341; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */