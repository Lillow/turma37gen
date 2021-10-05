package ListaDeExercicios3;

import java.util.Scanner;

public class Atividade6Dowhile
{

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		int cont = -1;
		int total = 0;
		
		do
		{
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			total += numero;
			cont ++;
			if (numero == 0)
			{
				break;
			}
		}while(true);
		total /= cont;
		System.out.println("A media dos números multiplos de 3 é " + total);

	}

}
