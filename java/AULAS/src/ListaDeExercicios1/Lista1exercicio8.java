package ListaDeExercicios1;
import java.util.Scanner;

public class Lista1exercicio8 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double valorDocarrofabrica, porcentagemDodistribuidor, porcentagemDoimposto, valorTotalfinal;

		System.out.print("Qual o valor do carro para a fabrica? ");
		valorDocarrofabrica = leia.nextDouble();
		System.out.print("Qual a taxa do distribuidor?");
		porcentagemDodistribuidor = leia.nextDouble();
		System.out.print("Qual a taxa de impostos?");
		porcentagemDoimposto = leia.nextDouble();

		porcentagemDodistribuidor= valorDocarrofabrica*porcentagemDodistribuidor/100;
		porcentagemDoimposto= valorDocarrofabrica*porcentagemDoimposto/100;
		
		valorTotalfinal= (porcentagemDodistribuidor+porcentagemDoimposto+valorDocarrofabrica);

		System.out.println("valor total a ser pago pelo carro R$"+valorTotalfinal);
		
	}

}
