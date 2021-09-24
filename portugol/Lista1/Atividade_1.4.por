programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{	
		//R = (A + B)²		D = R + S
		//				   _______	
		//S = (B + C)²            2
		
		inteiro a, b, c, r, s, d
		escreva("Digite o valor de A: ")
		leia (a) //A
		escreva("Digite o valor de B: ")
		leia (b) //B
		escreva("Digite o valor de C: ")
		leia (c) //C
		r = mat.potencia((a + b), 2.0) //R
		s = mat.potencia((b + c), 2.0)//S
		d = (r + s) / 2 //D
		escreva (d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */