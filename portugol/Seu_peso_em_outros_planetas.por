programa
{
	inclua biblioteca Matematica --> mat
	
	
	funcao inicio()
	{
		const real MERCURIO = 0.37, VENUS = 0.88, MARTE = 0.38, JUPITER = 2.64, SATURNO = 1.15, URANO = 1.17
		real pesoNaTerra = 0, pesoNoPlaneta = 0
		inteiro numeroPlaneta = 0
		escreva("Digite um número para o planeta '1 = Mercurio, 2 = Venus, 3 = Marte, 4 = Jupiter, 5 = Saturnu e 6 = Urano' ")
		leia (numeroPlaneta)
		escreva("Digite o seu peso em Kg: ")
		leia(pesoNaTerra)
		
		escolha (numeroPlaneta){
			caso 1: escreva("O seu peso em Mercúrio é ", pesoNoPlaneta = mat.arredondar(((pesoNaTerra/10)*MERCURIO), 2))
			pare
			caso 2: escreva("O seu peso em Venus é ", pesoNoPlaneta = mat.arredondar(((pesoNaTerra/10)*VENUS), 2))
			pare
			caso 3: escreva("O seu peso em Marte é ", pesoNoPlaneta = mat.arredondar(((pesoNaTerra/10)*MARTE), 2))
			pare
			caso 4: escreva("O seu peso em Jupiter é ", pesoNoPlaneta = mat.arredondar(((pesoNaTerra/10)*JUPITER), 2))
			pare
			caso 5: escreva("O seu peso em Saturno é ", pesoNoPlaneta = mat.arredondar(((pesoNaTerra/10)*SATURNO), 2))
			pare
			caso 6: escreva("O seu peso em Urano é ", pesoNoPlaneta = mat.arredondar(((pesoNaTerra/10)*URANO), 2))
			pare
			caso contrario: escreva("Digite um número válido.")
			
			}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */