package Animais;

public class TesteAnimais {
	public static void main(String[] args) 
	{
		Animal cachorro1 = new Cachorro("Salatiel",3);
		Animal cavalo1 = new Cavalo("João",5);
		Animal preguica1 = new Preguica("Irene",6);
		
		cachorro1.som();
		cachorro1.movimento();
		cavalo1.som();
		cavalo1.movimento();
		preguica1.som();
		preguica1.movimento();
	}

}
