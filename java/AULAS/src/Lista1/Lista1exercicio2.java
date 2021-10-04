package Lista1;
import java.util.Scanner;

public class Lista1exercicio2 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int dias, totalAnos, totalMeses, totalDias;
		System.out.print("Dias: ");
		dias = leia.nextInt();
		totalAnos = dias / 365;
		totalMeses = (dias % 365) / 30;
        totalDias = (dias % 365) % 30;
        System.out.println("Você tem "+ totalAnos+ " anos "+ totalMeses+ " meses e "+ totalDias+ " dias");
	}

}
