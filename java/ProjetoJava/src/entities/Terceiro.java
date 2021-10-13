package entities;

public class Terceiro extends Funcionario{
	private double adicional;

	public Terceiro(String nome, String matricula, double adicional) {
		super(nome, matricula);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	 @Override
	 public double calculoSalario()
	 {
		return this.getHorasTrabalhadas() * this.getValorHora() + this.adicional;
	 }
	 
	 @Override
	 public double calcularFerias()
	 {
		 return this.calculoSalario() * 1.3;
	 }

}
