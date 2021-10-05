import java.util.Scanner;

public class LaçoDeRepetiçãoWhile 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Idade: ");
		idade = leia.nextInt();
		
		while (idade > 1)
		{
			System.out.printf("Sua idade %d \n",idade);
			if (idade >= 18)
			{
				System.out.println("Você é de maior!");
			}
			else
			{
				System.out.println("Você é menor!");
			}
			System.out.print("Idade: ");
			idade = leia.nextInt();
		}

	}

}
