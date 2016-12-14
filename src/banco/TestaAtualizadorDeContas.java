package banco;

public class TestaAtualizadorDeContas {

	public static void main(String[] args) {
		
		        Conta c = new Conta();
		        Conta cc = new ContaCorrente();
		        Conta cp = new ContaPoupanca();

		        c.Deposita(1000);
		        cc.Deposita(1000); 
		        cp.Deposita(1000);

		        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		        adc.roda(c);
		        adc.roda(cc);
		        adc.roda(cp);

		        System.out.println("Saldo Total: " + adc.getSaldoTotal());
		    }




}
