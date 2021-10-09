package app;

import entities.ProdutoEletronico;

public class TesteProdutoEletronico {
	public static void main(String[] args) 
	{
		ProdutoEletronico televisao = new ProdutoEletronico("Samsung Smart Tv 58","Uhd 4k 58au7700","Samsung");
		televisao.setConsumo(280);
		televisao.ligar();
		televisao.analogico();
		televisao.automatico();
		televisao.desligar();
	}

}
