package ListaDeExercicios3;

import java.util.Scanner;

public class Atividade5DoWhile 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		int soma = 0;
		
		do
		{
			System.out.println("Digite um número e 0 para parar: ");
			numero =  leia.nextInt();
			soma += numero;
			if (numero == 0)
			{
				break;
			}
			
		}while(true);
		System.out.println("A soma dos valores digitados é " + soma);

	}

}