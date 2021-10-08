package POO;

public class Carro 
{
	//atributos
	public String placa;
	public String modelo;
	public boolean ligado;
	public int anoFabricacao;
	public String fabricante;
	public int macha;
	public double velocidade;
	
	//construtor
	public Carro(String placa, String modelo, String fabricante) 
	{
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	//sobrecarga de construtor
	public Carro() 
	{

	}
	//encapsulamento
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getMacha() {
		return macha;
	}
	public void setMacha(int macha) {
		this.macha = macha;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	//metodos
	public void ligarCarro()
	{
		this.ligado = true;
		
	}
	public void desligarCarro()
	{

		this.ligado = false;
	}
	public void subirMacha()
	{
		if (this.ligado && this.macha <= 5)
		{
			macha ++;
		}
	}
	public void descerMacha()
	{
		if (this.ligado && this.macha > 0)
		{
			macha --;
		}
	}
	public void acelerar()
	{
		velocidade += 5;
	}
	public void reduzir()
	{
		velocidade -= 5;
	}
	public void freio()
	{
		if (this.velocidade > 0)
		{
			for (int i = 0; i < this.velocidade; i--);
			{
				this.velocidade -= 5;
			}
		}
	}
	
	
}