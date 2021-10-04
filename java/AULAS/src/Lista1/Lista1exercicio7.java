package Lista1;
import java.util.Scanner;

public class Lista1exercicio7 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		System.out.print("a: ");
		a = leia.nextDouble();
		System.out.print("b: ");
		b = leia.nextDouble();
		System.out.print("c: ");
		c = leia.nextDouble();
		System.out.print("d: ");
		d = leia.nextDouble();
		System.out.print("e: ");
		e = leia.nextDouble();
		System.out.print("f: ");
		f = leia.nextDouble();
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		System.out.println("O valor de x é "+ x + " e o valor de y é " + y);

	}

}
