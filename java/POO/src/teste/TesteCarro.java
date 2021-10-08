package teste;

import POO.Carro;

public class TesteCarro 
{

	public static void main(String[] args) 
	{
		Carro  meuCarro = new Carro();
		
		meuCarro.cor = "Preto";
		meuCarro.modelo = "Tesla";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		System.out.println(meuCarro.pegaMacha());
		
	}

}
