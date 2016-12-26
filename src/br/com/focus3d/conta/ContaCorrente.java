package br.com.focus3d.conta;

import br.com.focus3d.sistema.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{
	

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}
	
	public ContaCorrente(int numero, String nome) {
		super(numero, nome);
		// TODO Auto-generated constructor stub
	}

	//reescrevendo o metodo atualiza.
	//lembrando que para acessar um atributo da classe mae, este atributo precisa estar como protected
	public void Atualiza(double taxa){
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
