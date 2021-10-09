package app;

import entities.ContaBancaria;

public class TesteContaBancaria {

	public static void main(String[] args) 
	{
		ContaBancaria conta = new ContaBancaria();
		conta.Conta(111000,"111.222.333-00", 80.00, false);
		conta.ativarConta();
		conta.credito(6000000);
		conta.debito(99);
		System.out.println(conta.getCpf());
		System.out.println(conta.getNumero());
		System.out.println(conta.getSaldo());

	}

}
