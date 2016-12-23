package banco;

public abstract class Conta {

	protected double saldo;

	public double getSaldo() {
		return saldo;
	}
	

	public void Deposita(double valor){
		this.saldo += valor;
	}
	
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
	
}
