package entities;

public class Aviao 
{
	public String modelo;
	public String cor;
	public String outroNome;
	public double velocidadeKh;
	public int anoInicioProducao;
	public int unidadesFabricadas;
	public int lugares;
	
	public Aviao(String modelo,String cor,String outroNome,double velocidadeKh,int anoInicioProducao,int unidadesFabricadas,int lugares) 
	{
		this.modelo = modelo;
		this.cor = cor;
		this.outroNome = outroNome;
		this.velocidadeKh = velocidadeKh;
		this.anoInicioProducao = anoInicioProducao;
		this.unidadesFabricadas = unidadesFabricadas;
		this.lugares = lugares;
		
	}
	public void ligar()
	{
		System.out.println("Avi�o ligado");
	}
	public void decolar()
	{
		System.out.println("Avi�o decolando");;
	}
	
	public void pousar()
	{
		System.out.println("Avi�o pousando");;
	}
	@Override
	public String toString() {
		return "Aviao \n modelo:" + modelo + "\n cor: " + cor + "\n outroNome: " + outroNome + "\n velocidadeKh: "
				+ velocidadeKh + "\n anoInicioProducao: " + anoInicioProducao + "\n unidadesFabricadas: "
				+ unidadesFabricadas + "\n lugares: " + lugares;
	}

	

}
