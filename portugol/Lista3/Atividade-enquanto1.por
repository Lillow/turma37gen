programa
{
	
	funcao inicio()
	{
		inteiro numero = 0 
		inteiro total = 0
		inteiro contador = 0
		real media = 0
		enquanto (numero >= 0){
			escreva("Digite um número positivo ou negativo para parar: ")
			leia(numero)
			se (numero >= 0){
				total += numero
				contador ++
				}
			}
		media = total / contador
		escreva ("O total do somatório é: " + total + "\n")
		escreva ("A média dos valores foi: " + media + " e " + contador + " valores foram lidos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */