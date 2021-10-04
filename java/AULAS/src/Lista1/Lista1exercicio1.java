package Lista1;
import java.util.Scanner;

public class Lista1exercicio1 
{

	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		int anos =0 , meses = 0, dias = 0, totalDias = 0; 
		System.out.print("Anos: ");
		anos = leia.nextInt();
		System.out.print("Meses: ");
		meses = leia.nextInt();
		System.out.print("Dias: ");
		dias = leia.nextInt();
		totalDias = anos * 365 + meses * 30 + dias;
		System.out.println("A sua idade total em dias é: "+ totalDias);
	}

}
