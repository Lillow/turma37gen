package Animais;
public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) 
	{
		super(nome, idade);

	}
	public void som()
	{
		System.out.println("Latindo");
	}
	public void movimento()
	{
		System.out.println("Corre a 48 km/h");
	}
}
