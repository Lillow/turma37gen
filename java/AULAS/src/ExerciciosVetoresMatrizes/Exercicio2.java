package ExerciciosVetoresMatrizes;

public class Exercicio2 
{
	public static void main(String[] args) 
	{
			int [] lancamentos = new int [10];
			int maior = 0;
			float media = 0.0f;
			int contMaior =0;
			
			for(int i = 0; i < 10; i++)
			{
				lancamentos [i] = 1 + (int) (Math.random() * 6);
				media += lancamentos [i];
				if (lancamentos[i] > maior)
				{
					maior = lancamentos [i];
				}
				
			}
			for(int i = 0; i < 10; i++)
			{
				System.out.printf("%d \t",lancamentos[i]);
				if (maior ==  lancamentos [i])
				{
					contMaior ++;
				}
			}
			System.out.println();
			System.out.printf("A média aritimética foi %.2f e o maior resultado foi %d e ele apareceu %d vezes.", (media/10), maior, contMaior);
	}
	
}
