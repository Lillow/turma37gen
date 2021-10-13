package app;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {

	public static void main(String[] args) 
	{
		Funcionario funcionario = new Terceiro("Tadeu", "123987456", 80.12);
		
		funcionario.setHorasTrabalhadas(40);
		funcionario.setValorHora(10.00);
		
		System.out.println("Salario do funcionário "+funcionario.getNome()+"\nMatrícula: "+funcionario.getMatricula()+"\nSlario R$ "+funcionario.calculoSalario() + "\nFérias R$ "+funcionario.calcularFerias());
	}

}
