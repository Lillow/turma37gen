package entities;

public class Paciente {
	private String nome;
	private int idade;
	private int ano;
	private boolean alta;
	
	public Paciente(String nome, int ano) {
		this.nome = nome;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isAlta() {
		return alta;
	}

	public void setAlta(boolean alta) {
		this.alta = alta;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void idade()
	{
		this.idade = 2021 - this.ano;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", idade=" + idade + ", ano=" + ano + ", alta=" + alta + "]";
	}
	


}
