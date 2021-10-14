package entities;

public class ContaCorrente extends Conta{
	private int contadorTalao;

	public ContaCorrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}
	

}
