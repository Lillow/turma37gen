import java.util.Scanner;

public class DesafioAuxilio 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		String nome = " ";
		final float AUXILIO = 600.00f;
		final float VALORFILHO = 50.00f;
		float total = 0.00f;
		char escolha = ' ';
		char pronome = ' ';
		int filhos = 0;
		
		
		System.out.print("Digite o seu nome: ");
		nome  = leia.next();
		System.out.print("Você recebe algum tipo de ajuda financeira do governo?[S/N] ");
		escolha = leia.next().toUpperCase().charAt(0);
		if (escolha == 'S')
		{
			System.out.println("Você não pode receber outro auxílio!");
		}
		else if (escolha == 'N')
		{
			System.out.print("Você é chefa de família?  ");
			pronome = leia.next().toUpperCase().charAt(0);
			System.out.print("Qauntos Filhos você possue? ");
			filhos = leia.nextInt();
			total = VALORFILHO * filhos + AUXILIO;
			if (pronome == 'A')
			{
					total *= 2;
				
			}
		}
		else 
		{
			System.out.println("Opção inválida!");
		}
		System.out.printf("Você receberá R$ %.2f", total);
	}
}
