programa
{
	
	funcao inicio()
	{
		real numero1, numero2, numero3, numero4
		real quad1, quad2, quad3, quad4
		escreva ("1º número: ")
		leia (numero1)
		escreva ("2º número: ")
		leia (numero2)
		escreva ("3º número: ")
		leia (numero3)
		escreva ("4º número: ")
		leia (numero4)
		quad1 = numero1 * numero1
		quad2 = numero2 * numero2
		quad3 = numero3 * numero3
		quad4 = numero4 * numero4
		se (quad3 >= 1000){
			escreva("\n o valor resultante do quadrado do terceiro número é: ", quad3)
		}
		senao{
			escreva("\n quadrado do primeiro número: ", quad1)
			escreva("\n Quadrado do segundo número: ", quad2)
			escreva("\n Quadrado do terceiro número: ", quad3)
			escreva("\n Quadrado do quarto número: ", quad4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */