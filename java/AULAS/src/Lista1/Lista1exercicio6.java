package Lista1;
import java.util.Locale;
import java.util.Scanner;

public class Lista1exercicio6 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double x1, y1, x2, y2;
		double d;
		System.out.print("x1: ");
		x1 = leia.nextDouble();
		System.out.print("y1: ");
		y1 = leia.nextDouble();
		System.out.print("x2: ");
		x2 = leia.nextDouble();
		System.out.print("y2: ");
		y2 = leia.nextDouble();
		d = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		System.out.printf("O valor de d é: %.2f",d);
		
	}

}
