package Polimorfismo;

public class TestePolimorfismo {
	public static void main(String[] args) 
	{
		PessoaFisica fisica = new PessoaFisica();
		PessoaJuridica juridica = new PessoaJuridica();
		Pessoa1[] pessoas = new Pessoa1[2];
		
		fisica.setNome("Fernanda");
		fisica.setCpf(15595175355l);
		
		juridica.setNome("Lojas Fernanda");
		juridica.setCnpj(155357159551984l);
		
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa1 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
		
	}

}
