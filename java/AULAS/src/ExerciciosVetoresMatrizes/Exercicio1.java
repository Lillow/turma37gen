package ExerciciosVetoresMatrizes;

public class Exercicio1 
{

	public static void main(String[] args) 
	{
		double [] vetor = new double [5];
		double maior = 0.0;

				for (int i = 0; i < vetor.length; i++)
				{
					vetor [i] = 1 + (double) (Math.random()) * 10;
					System.out.printf("%.2f \n", vetor[i]);

					if (vetor[i] > maior);
					{
						maior = vetor[i];
					}
				}
				System.out.printf("A maior pontuação foi: %.2f", maior);

	}

}
