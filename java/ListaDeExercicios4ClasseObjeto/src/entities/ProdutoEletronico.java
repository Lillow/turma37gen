package entities;

public class ProdutoEletronico {
	private String nome;
	private String modelo;
	private String fabricante;
	private float consumo;
	
	public ProdutoEletronico(String nome, String modelo, String fabricante) {
		this.nome = nome;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public void ligar()
	{
		System.out.println("Ligado;");
	}
	
	public void analogico()
	{
		System.out.println("analogico");
	}
	
	public void automatico()
	{
		System.out.println("automatico");
	}
	public void desligar()
	{
		System.out.println("Desligado");
	}

	@Override
	public String toString() {
		return "ProdutoEletronico [nome=" + nome + ", modelo=" + modelo + ", fabricante=" + fabricante + ", consumo="
				+ consumo + "]";
	}

}
