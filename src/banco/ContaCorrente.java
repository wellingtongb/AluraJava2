package banco;

public class ContaCorrente extends Conta implements Tributavel{
	
	
	
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
