package teste;

import POO.Carro;

public class TesteCarro 
{

	public static void main(String[] args) 
	{
		Carro carro1 = new Carro("PXE-1301", "Roadster", "Tesla");
		Carro carro2 = new Carro();
		

		carro1.ligarCarro();
		carro1.setMacha(1);
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		System.out.println(carro1.getMacha());
		System.out.println(carro1.getVelocidade());
		carro1.setMacha(2);
		carro1.acelerar();
		carro1.acelerar();
		System.out.println(carro1.getMacha());
		System.out.println(carro1.getVelocidade());
		
		

		
	}

}
