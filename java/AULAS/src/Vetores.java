import java.util.Scanner;

public class Vetores 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int [] array1 = {12, 3, 5, 68, 9, 6, 73, 44, 456, 65, 321};
		int [] array2 = {43, 42, 4, 8, 55, 21, 2, 45};
		float [] nota = new float[5];
		
		if (array2.length > 8)
		{
			System.out.println("O tamanho do Array2 é maior que 8.");
		}else
		{
			System.out.println("O tamanho do Array2 não é maior que 8.");
		}
		System.out.println("Tamanho do Array1 "+ array1.length);
		
		String[] cars = {"Volvo", "Ford", "Mazda"};
		
		for(String i : cars)
		{
			System.out.println(i);
		}
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Entre com uma nota: ");
			nota[i] = leia.nextFloat();
		}
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Nota"+(i+1) + " = " + nota[i]);
		}
		
	}

}
