package app;

import entities.Conta;
import entities.ContaPoupanca;

public class TesteBanco {
	public static void main(String[] args) 
	{		
		ContaPoupanca cp1 = new ContaPoupanca(123345, "1234678", 12);
		
		System.out.println(cp1.getSaldo());
		cp1.credito(100.00);
		System.out.println(cp1.getSaldo());
		cp1.correcao(12);
		System.out.println(cp1.getSaldo());
		cp1.debito(111.00);
		System.out.println(cp1.getSaldo());
		cp1.debito(50.0);
		System.out.println(cp1.getSaldo());
	}
}
