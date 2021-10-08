package Animais;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) 
	{
		super(nome, idade);
		
	}
	public void som()
	{
		System.out.println("Emite um som peculiar");
	}
	public void movimento()
	{
		System.out.println("Subindo a arvore a 0,27 km/h");
	}
	

}
