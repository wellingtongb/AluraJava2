package br.com.focus3d.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
	
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}
	
	public ContaPoupanca(int numero, String nome) {
		super(numero, nome);
		// TODO Auto-generated constructor stub
	}

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

	//sobescrevendo o metodo de comparação da interface comparable
	@Override
	public int compareTo(ContaPoupanca cpParaComparar) {
		if(this.numero < cpParaComparar.numero)
			return -1;
		if(this.numero > cpParaComparar.numero)
			return 1;
		return 0;
	}



}
