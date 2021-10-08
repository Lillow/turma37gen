package Animais;
public class Cavalo extends Animal{

	public Cavalo(String nome, int idade)
	{
		super(nome, idade);
		
	}
	

	public void som()
	{
		System.out.println("Trotando e relichando");
	}
	public void movimento()
	{
		System.out.println("Corre a 88 km/h");
	}
}
