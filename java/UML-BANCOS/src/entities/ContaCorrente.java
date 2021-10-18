package entities;

public class ContaCorrente extends Conta{
	private int contadorTalao;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int number, String cpf) {
		super(number, cpf);
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	
	public void pediTalao(int contadorTalao) {
		saldo-=(30*contadorTalao);
	}

	public String toString() {
		return  "| Numero da conta: " + getNumero() + "| Saldo da Conta: " + getSaldo() + "| Conta Ativa: " + isAtivo()
				+ "| CPF do Titular: " + getCpf() +"  Quantidade de Talões: " + getContadorTalao()
				+ " |";
	}
	

}
