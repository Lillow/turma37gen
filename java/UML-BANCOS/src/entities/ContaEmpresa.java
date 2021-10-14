package entities;

public class ContaEmpresa extends Conta{
	private int contadorTalao;

	public ContaEmpresa(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}
	
	

}
