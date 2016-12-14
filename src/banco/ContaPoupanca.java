package banco;

public class ContaPoupanca extends Conta {
	
	public void Atualiza(double taxa){
		
		this.saldo += this.saldo * taxa * 3;
	}
	
	public void Deposita(double valor){
		
		this.saldo += valor - 0.10;
	}

}
