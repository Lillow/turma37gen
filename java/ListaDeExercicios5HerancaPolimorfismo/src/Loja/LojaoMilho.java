package Loja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class LojaoMilho {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		Collection<String> estoque = new ArrayList();
		String item;
		char decisao = 'S';
		
		estoque.add("Pamonha");
		estoque.add("Canjica");
		estoque.add("Milho verde");
		estoque.add("Tapioca");
		System.out.println(estoque);
		while(true)
		{
			System.out.print("Deseja adicionar mais um item? [S/N]");
			decisao = leia.next().toUpperCase().charAt(0);
			if (decisao == 'N')
			{
				break;
			}
			System.out.print("Nome do produto: ");
			item = leia.next();
			estoque.add(item);
			System.out.println(estoque);
			
		}
		while(true)
		{
			System.out.print("Deseja remover um item? [S/N]");
			decisao = leia.next().toUpperCase().charAt(0);
			if (decisao == 'N')
			{
				break;
			}
			System.out.print("Nome do produto: ");
			item = leia.next();
			estoque.remove(item);
			System.out.println(estoque);
		}
		System.out.println(estoque);
	}
	
	

}
