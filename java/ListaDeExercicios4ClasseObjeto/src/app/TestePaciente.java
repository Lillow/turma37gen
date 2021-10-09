package app;

import entities.Paciente;

public class TestePaciente {

	public static void main(String[] args) 
	{
		Paciente lineu = new Paciente("Lineu",1985);
		lineu.idade();
		System.out.println(lineu);

	}

}
