programa
{
	
	funcao inicio()
	{
		real base, altura, area = 0
		escreva ("Base: ")
		leia (base)
		escreva ("Altura: ")
		leia(altura)
		se (base > 0 e altura > 0){
			area = base * altura / 2
			escreva("A area do triângulo é: ", area)
		}
		senao{
			escreva("Valores inválidos.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */