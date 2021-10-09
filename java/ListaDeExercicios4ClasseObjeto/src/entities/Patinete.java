package entities;

public class Patinete {
	public String modelo;
	public boolean eletrico;
	public double velociade = 0.0;
	public double velocidadeMax;
	public Patinete(String modelo) {
		super();
		this.modelo = modelo;
	}
	public void ligar()
	{
		System.out.println("Ligado");
	}
	public void andar()
	{
		if (this.velociade >= 0.0 && this.velociade < this.velocidadeMax)
		{
			this.velociade ++;
		}
	}
	public void reduzir()
	{
		if (this.velociade > 0.0)
		{
			this.velociade --;
		}
	}
	public void desligar()
	{
		System.out.println("Desligado");
	}
}
