package entities;

public class ContaEstudantil extends Conta{
	private double limiteEstudantil;

	public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}
	
	

}
