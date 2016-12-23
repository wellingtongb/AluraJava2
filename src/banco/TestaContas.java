package banco;

public class TestaContas {

	public static void main(String[] args) {
/*		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();*/
		
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
	
		cc.Deposita(1000);
		cp.Deposita(1000);
		

		cc.Atualiza(0.01);
		cp.Atualiza(0.01);
		

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		//testando a classe de exceptions
		/*Conta ce = new ContaCorrente();
		ce.Deposita(250.0);
		try {
			ce.Saca(300);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}*/
		
		//testando metodo deposita com exceptions
		Conta cf = new ContaCorrente();
		try {
			cf.Deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
