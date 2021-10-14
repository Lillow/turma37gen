package entities;

public class ContaEspecial extends Conta {
	 private double limite=1000.0;

	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite=limite;
		// TODO Auto-generated constructor stub
	}

	public double getLimite() {
		return limite;
	}
	/*Aqui no caso utilizei o mesmo m�todo d�bito de conta de forma diferente pra usar polimorfismo. Se o valor do d�bito for maior
	que o saldo, o mecanismo do limite especial � ativado, subtraindo assim o restante desse limite*/
    @Override
	public double debito(double valorDebito) {
		if (valorDebito <= this.saldo && valorDebito<limite)  
		{
			this.saldo = this.saldo - valorDebito;
			System.out.println("Limite Especial n�o utilizado.");
		} 
		else if (valorDebito>saldo)
		{

			limite=(limite-saldo)-valorDebito;
			saldo=0;
			System.out.println("Seu saldo � de: R$"+saldo+". Seu limite � de: R$"+limite);

		}
		return this.saldo;
    	}




}