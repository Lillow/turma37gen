package app;

import entities.Aviao;

public class TesteAviao 
{

	public static void main(String[] args) 
	{
		Aviao aviao1 = new Aviao("1956","Branco","Skyhawk",220,1956,44000,4);
		System.out.println(aviao1);
		aviao1.ligar();
		aviao1.decolar();
		aviao1.pousar();
	}

}
