package entities;

public class Cliente 
{


	//dados do cliente
    private String nome;
    private String email;
    private String telefone;
    private int cep;
    private int anoNascimento;
    private char sexo;
    private String cpf;

    public Cliente() 
    {

	}

	public int calcularIdade() {
        return 2021 - anoNascimento;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente \n nome: " + nome + "\n Idade: " + calcularIdade() + "\n email: " + email + "\n telefone: " + telefone + "\n cep: " + cep
				+ "\n anoNascimento: " + anoNascimento + "\n sexo: " + sexo + "\n cpf: " + cpf + "]";
	}

}


