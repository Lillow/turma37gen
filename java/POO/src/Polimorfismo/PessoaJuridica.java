package Polimorfismo;

public class PessoaJuridica extends Pessoa1 {
	private long cnpj;

	public PessoaJuridica() {
		super();
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome()
	{
		return "Pessoa jurídica: " + super.getNome() + " - CNPJ: " + this.getCnpj();
	}

}
