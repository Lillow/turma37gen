package ExerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio4 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int [][] mat = new int [3][3]; 
		int l = 0;
		int c = 0; 
		int soma = 0;
		int somaDiagonal = 0;
				
		for (l = 0; l < 3; l++)
		{
			for(c = 0; c < 3; c++)
			{
				System.out.printf("Digite um valor [%d] [%d]: ", (l+1), (c+1));
				mat [l][c] = leia.nextInt();
				soma += mat [l][c];
				if(l == c)
				{
					somaDiagonal += mat [l][c];
				}
			}
		}
		for (l = 0; l < 3; l++)
		{
			for(c = 0; c < 3; c++)
			{
				System.out.printf("[%d]\t", mat[l][c]);
		
			}
			System.out.println();
		}
		System.out.printf("A soma de todos os valores é %d e a soma dos valores da diagonal é %d",soma , somaDiagonal);
		
	}

}
