package app;

import entities.Patinete;

public class TestePatinete {

	public static void main(String[] args) 
	{
		Patinete patinete1 = new Patinete("Patinete Elétrico E9 Branco - MW");
		patinete1.eletrico = true;
		patinete1.velocidadeMax = 80;
		
		patinete1.ligar();
		for (int i = 0; i < 50; i++)
		{
			patinete1.andar();
		}
		System.out.println(patinete1.velociade+"Km/h");
		for (int i = 0; i < 50; i++)
		{
			patinete1.reduzir();
		}
		System.out.println(patinete1.velociade+"Km/h");
		patinete1.desligar();
		

	}

}
