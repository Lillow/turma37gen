package HERANCA;

public class TestePessoaHeranca {
	public static void main(String[] args) 
	{
		Pessoa jessica = new Pessoa("Jessica", 555);
		Funcionario pedro = new Funcionario("Pedro", 222, "TI");
		Pessoa maria = new Funcionario("Maria", 456, "TI");
		Pessoa jose = new Coordenador("José", 840, "TI");
		
		System.out.println(jessica.getNome()+ " " + jessica.getMatricula());
		System.out.println(pedro.getNome()+ " " + pedro.getMatricula() + " " + pedro.getDepartamento());
		System.out.println(maria.getNome()+ " " + maria.getMatricula());
		System.out.println(jose.getNome()+ " " + jose.getMatricula());
		
	}

}
