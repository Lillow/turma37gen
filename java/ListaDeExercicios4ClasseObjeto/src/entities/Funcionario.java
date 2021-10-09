package entities;

public class Funcionario {
	private String mome;
	private String departamento;
	private int matricula;
	public Funcionario(String mome, int matricula) {
		super();
		this.mome = mome;
		this.matricula = matricula;
	}
	public String getMome() {
		return mome;
	}
	public void setMome(String mome) {
		this.mome = mome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Funcionario [mome=" + mome + ", departamento=" + departamento + ", matricula=" + matricula + "]";
	}
	

}

