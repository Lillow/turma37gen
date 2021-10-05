package ListaDeExercicios3;

import java.util.Scanner;

public class Atividade2For 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int array[] = new int[10];
		int contPar = 0;
		int contImpar = 0;
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Digite um número: ");
			array[i] = leia.nextInt();
			if(array[i] % 2 == 0)
			{
				contPar += 1;
			}else
			{
				contImpar += 1;
			}
		}
		System.out.printf("Dos números digitados %d foram par e %d foram ímpar.",contPar, contImpar);

	}

}
