package br.com.focus3d.conta;

/**
 * Classe conta, mãe de todas os tipos de conta, como poupança e corrente
 * @author Wellington
 *
 */
public abstract class Conta {

	protected double saldo;
	protected int numero;
	protected String nome;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	public double getSaldo() {
		return saldo;
	}
	

	public int getNumero() {
		return numero;
	}



	/**
	 *  acrescenta um valor ao saldo da conta, não podendo este valor ser menor que zero
	 * @param valor
	 */
	public void Deposita(double valor){
		
		if(valor <= 0 ){
			throw new ValorInvalidoException(valor);
		}else
			
			this.saldo += valor;
	}
	
	/**
	 * Retira um valor do saldo da conta, apenas se este valor for valido, ou seja, menor que o saldo atual da conta
	 * @param valorSacar
	 */
	public void Saca(double valorSacar){
		if(this.saldo < valorSacar){
			throw new SaldoInsuficienteException("Saldo insuficiente, tente um valos menor.");
		}else{
			this.saldo -= valorSacar;
		}			
	}
	
	public void Atualiza(double taxa){
		
		this.saldo += ( this.saldo * taxa);
	}
	
	@Override
	public String toString() {
		
		return "Este objeto é uma conta com o saldo de: "+ this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		
		return (this.numero == outraConta.numero && 
				this.nome.equals(outraConta.nome));
	}
}
