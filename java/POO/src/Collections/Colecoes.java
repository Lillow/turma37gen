package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Colecoes {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		String nome;
		Collection<String> nomes = new ArrayList();
		Collection<String> nomes2 = new ArrayList();
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print("Digite um nome: ");
			nome = leia.next();
			nomes.add(nome);
		}
		if(nomes.isEmpty())
		{
			System.out.println("Lista vazia...");
		}
		else
		{
			System.out.println(nomes);
		}
		nomes2.add("Luiz");
		nomes2.add("Lucia");
		
		nomes.addAll(nomes2);	//Adiciona todos os elementos de uma lista na outra
		nomes.remove("Nome"); 	//Apaga o elemento Nome da lista
		//nomes.clear();			//Limpa a lista
		//nomes.contains("Nome");	//Verifica se nome está na lista
		
		for (String item:nomes)
		{
			System.out.println("Nomes: " + item);
		}
	}

}
