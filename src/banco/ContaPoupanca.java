package banco;

public class ContaPoupanca extends Conta {
	
	public  void Atualiza(double taxa){
		
		this.saldo += this.saldo * taxa * 3;
	}
	
	public void Deposita(double valor){
		
		this.saldo += valor - 0.10;
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Saca(double valorSacar) {
		// TODO Auto-generated method stub
		
	}



}
