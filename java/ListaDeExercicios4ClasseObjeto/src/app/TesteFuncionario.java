package app;

import entities.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) 
	{
		Funcionario Laura = new Funcionario("Laura",876456);
		Laura.setDepartamento("TI");
		System.out.println(Laura);
	}

}
