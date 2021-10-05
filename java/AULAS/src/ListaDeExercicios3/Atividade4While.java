package ListaDeExercicios3;

import java.util.Scanner;

public class Atividade4While 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade = 0;
		int sexo;
		int op;
		int inicio = 0;
		int pessoasCalmas = 0, mulheresNervosas = 0 , homensAgressivos = 0, outrosCalmos = 0, pessoasNervosasMais40 = 0, pessoasCalmasMenos18 = 0;
		
		while(inicio < 3)
		{
			
			System.out.print("Nome: ");
			nome = leia.next();
			System.out.print("Idade: ");
			idade = leia.nextInt();
			System.out.print("1-feminino / 2-masculino / 3-Outros: ");
			sexo  = leia.nextInt();
			System.out.print("1-calma / 2-nervosa / 3-agressiva: ");
			op = leia.nextInt();

			if (op == 1)
			{
				pessoasCalmas ++;
				if (sexo == 2)
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
			inicio ++;
		}
		System.out.printf("o número de pessoas calmas %d; \r\n o número de mulheres nervosas %d; \r\n o número de homens agressivos %d; \r\n o número de outros calmos %d;\r\n o número de pessoas nervosas com mais de 40 anos %d; \r\n o número de pessoas calmas com menos de 18 anos .\r\n", pessoasCalmas, mulheresNervosas, homensAgressivos, outrosCalmos, pessoasNervosasMais40, pessoasCalmasMenos18);
		
	}

}
