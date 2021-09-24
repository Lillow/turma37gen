programa
{
	
	funcao inicio()
	{
		inteiro c
		real n, ex, sal, hex

		escreva ("Digite o código do funcionário")
		leia (c)

		escreva("Digite o número de horas trabalhadas: ")
		leia(n)
		
		se (n > 50){
		ex = n - 50
		hex = ex * 20
		sal = 50 * 10
		escreva ("Salario Total R$", sal, "\n Excedente R$", hex)
		}
		
		senao{
		ex = 0
		sal = n * 10
		escreva ("Salario Total R$", sal, "\n Excedente R$", ex)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 129; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */