package Lista1;
import java.util.Scanner;

public class Lista1exercicio5 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		System.out.print("Digite a 1� nota: ");
		nota1 = leia.nextDouble();
		System.out.print("Digitee a 2� nota: ");
		nota2 = leia.nextDouble();
		System.out.print("Digite a 3� nota: ");
		nota3 = leia.nextDouble();
		media = ((nota1 *2 ) + ( nota2 * 3 ) + (nota3 * 5)) / 10;
		System.out.println("A m�dia ponderada � "+ media);

	}

}
