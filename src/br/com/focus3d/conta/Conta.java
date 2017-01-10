package br.com.focus3d.conta;

/**
 * Classe conta, mãe de todas os tipos de conta, como poupança e corrente
 * @author Wellington
 *
 */
public abstract class Conta implements Comparable<Conta> {

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

	public String getNome() {
		return nome;
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
		
		return "Numero"+ this.numero + " Nome "+ this.nome + " Saldo "+ this.saldo;
	}
	
	/*//antigo metodo equals
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		
		return (this.numero == outraConta.numero && 
				this.nome.equals(outraConta.nome));
	}*/
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	public void Imprime() {
		System.out.println("numero Conta "+ this.numero);
		System.out.println("Saldo conta "+ this.saldo);
		
	}
	
	//sobescrevendo o metodo de comparação da interface comparable comparando numero da conta
/*	@Override
	public int compareTo(Conta cpParaComparar) {
		if(this.numero < cpParaComparar.numero)
			return -1;
		if(this.numero > cpParaComparar.numero)
			return 1;
		return 0;
	}*/
	
	//sobescrevendo o metodo de comparação da interface comparable comparando nome da conta
	@Override
	 public int compareTo(Conta outra) {
	        return this.nome.compareTo(outra.nome);
	    }
	
	
}
