package banco;

public class Conta {

	protected double saldo;

	public double getSaldo() {
		return saldo;
	}
	

	public void Deposita(double valor){
		this.saldo += valor;
	}
	
	public void Saca(double valorSacar){
		if(this.saldo < valorSacar){
			System.out.println("Operação inválida. Saldo insuficiente.");
		}else{
			this.saldo -= valorSacar;
		}			
	}
	
	public void Atualiza(double taxa){
		
		this.saldo += ( this.saldo * taxa);
	}
	
	
}
