package app;

import entities.Pessoa;
import entities.Produto;

public class CadProduto 
{

	public static void main(String[] args) 
	{
        Produto p1 = new Produto();
        Pessoa pe1 = new Pessoa();
        
        pe1.nome = "Juca";
        pe1.anoNascimento = 1995;
        pe1.email = "juca@kamail.com";
        p1.nome="camisa";
        p1.estoque= 10;
        p1.valor=60.00;
        p1.codigo="001";
        
        p1.tirarEstoque(2);
        System.out.println(p1);
        
        p1.colocarEstoque(20);
        System.out.println(p1);
        
        System.out.println(pe1);

		

	}

}
