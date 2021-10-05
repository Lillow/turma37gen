package ListaDeExercicios3;

import java.util.Scanner;

public class Atividade3While 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int idade = 0;
		int menos21 = 0;
		int mais50 = -1;
		
		while (idade < 99)
		{
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			if (idade < 21)
			{
				menos21 ++;
			}else if (idade > 50)
			{
				mais50 ++;
			}
		}
		System.out.printf("Ao todo temos %d com menos de 21 anos e %d com mais de 50 anos", menos21, mais50);
		
		

	}

}
