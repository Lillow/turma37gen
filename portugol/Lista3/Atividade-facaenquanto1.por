programa
{
	
/*Faça um programa que mostre uma contagem na tela de 233 a 456, 
só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/
	
	funcao inicio()
	{
		
		inteiro numero = 233
		inteiro incremento = 3
		faca
		{
			escreva (numero + "\n")
			numero += incremento
			se (numero > 400){
				incremento = 5
				}
			}enquanto(numero<456)
			escreva (numero + "\n")
	}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 408; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */