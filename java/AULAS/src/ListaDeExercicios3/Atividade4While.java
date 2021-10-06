package ListaDeExercicios3;

import java.util.Scanner;

public class Atividade4While 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade = 0;
		byte sexo; //("1-feminino / 2-masculino / 3-Outros: ")
		byte op;   //("1-calma / 2-nervosa / 3-agressiva: ")
		int contHabitantes = 1;
		int pessoasCalmas = 0, mulheresNervosas = 0 , homensAgressivos = 0, outrosCalmos = 0, pessoasNervosasMais40 = 0, pessoasCalmasMenos18 = 0;
		char continuar = 'S';
		
		while(continuar == 'S' && contHabitantes <= 150)
		{
			
			System.out.print("Nome: ");
			nome = leia.next();
			System.out.print("Idade: ");
			idade = leia.nextInt();
			System.out.print("1-feminino / 2-masculino / 3-Outros: ");
			sexo  = leia.nextByte();
			System.out.print("1-calma / 2-nervosa / 3-agressiva: ");
			op = leia.nextByte();

			if (op == 1)
			{
				pessoasCalmas ++;
				if (sexo == 3)
				{
					outrosCalmos ++;
				}
				if (idade < 18)
				{
					pessoasCalmasMenos18 ++;
				}
			}else if (op == 2)
			{
				if (sexo == 1)
				{
					mulheresNervosas++;
				}
				if (idade > 40)
				{
					pessoasNervosasMais40 ++;
				}
			}else if (op == 3 && sexo == 2)
			{
				homensAgressivos ++;
			}
			System.out.println("Quer continuar?[S/N] ");
			continuar = leia.next().toUpperCase().charAt(0);
		}
		System.out.printf("\r o número de pessoas calmas %d; \r\n o número de mulheres nervosas %d; \r\n o número de homens agressivos %d; \r\n o número de outros calmos %d;\r\n o número de pessoas nervosas com mais de 40 anos %d; \r\n o número de pessoas calmas com menos de 18 anos %d \r\n", pessoasCalmas, mulheresNervosas, homensAgressivos, outrosCalmos, pessoasNervosasMais40, pessoasCalmasMenos18);
		
	}

}
