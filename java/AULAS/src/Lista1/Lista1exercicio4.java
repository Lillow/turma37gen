package Lista1;
import java.util.Scanner;

public class Lista1exercicio4 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		//R = (A + B)²			D = R + S
		//				   		_______	
		//S = (B + C)²            2
				
		double a, b, c, r, s, d;
		System.out.print("Digite o valor de A: ");
		a = leia.nextInt(); //A
		System.out.print("Digite o valor de B: ");
		b = leia.nextInt(); //B
		System.out.print("Digite o valor de C: ");
		c = leia.nextInt(); //C
		r = Math.pow((a + b), 2.0); //R
		s = Math.pow((b + c), 2.0);//S
		d = (r + s) / 2; //D
		System.out.print(d);

	}

}
