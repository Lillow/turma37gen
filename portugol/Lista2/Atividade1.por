programa
{
	
	funcao inicio()
	{
		real peso, excesso
		real multa
		escreva ("Qual é o peso dos tomates em Kg:")
		leia (peso)
		excesso = peso - 50
		se (peso > 50){
			multa = excesso * 4
			escreva("\n O peso to tomate está acima do permitido você sofrera uma multa de R$", multa)	
			}		
		senao {
			escreva("\n O peso não excedeu o limite, não terá multa.")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */