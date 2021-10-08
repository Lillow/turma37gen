package POO;

public class Carro 
{
	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	
	public void liga()
	{
		System.out.println("O carro está ligado...");
	}
	public void acelera(double quantidade)
	{
		this.velocidadeAtual  += quantidade;
	}
	public int pegaMacha()
	{
		if (this.velocidadeAtual < 0)
		{
			return -1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40)
		{
			return 1;
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80)
		{
			return 2;
		}
		return 3;
	}
}