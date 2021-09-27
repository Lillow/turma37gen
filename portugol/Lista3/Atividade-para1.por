programa
{
	
	funcao inicio()
	{
		const inteiro HABITANTES = 3
		real salario = 0
		real salario100 = 0
		real maiorSalario = 0
		real totalSalario = 0
		inteiro numeroFilhos = 0
		inteiro totalFilhos = 0
		para (inteiro habitantes = HABITANTES; habitantes > 0; habitantes--){
			escreva("Digite o salário do "+ habitantes + "º habitante R$: ")
			leia(salario)
			totalSalario += salario
			se (salario > maiorSalario){
				maiorSalario = salario
				}
			se (salario <= 100){
				salario100 ++
				}
			escreva("Digite o número de filhos: ")
			leia(numeroFilhos)
			totalFilhos += numeroFilhos
			}
		escreva("A média do salário da população é: " + totalSalario / HABITANTES + "\n")
		escreva("A média do número de filhos é: " + totalFilhos / HABITANTES + "\n")
		escreva("O maior salário é: " + maiorSalario + "\n")
		escreva("O percentual de pessoas com salário de até R$ 100,00 é: " + salario100 / HABITANTES * 100 + "\n")

			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */