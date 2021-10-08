package app;

import java.util.Scanner;

import entities.Cliente;

public class TesteCliente 
{
	Scanner leia = new Scanner(System.in);
	public static void main(String[] args) 
	{	
		
		Cliente cliente = new Cliente();
		cliente.setNome("Rebeca");
		cliente.setAnoNascimento(1997);
	    cliente.setCep(1112235);
	    cliente.setCpf("123.321.123.00");
	    cliente.setEmail("beca@kmail.com");
	    cliente.setSexo('F');
	    cliente.setTelefone("0000-0000");
	    cliente.calcularIdade();
	    
	    System.out.println(cliente);
	}

}
