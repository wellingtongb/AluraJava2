package banco;

public class TestaGerenciadoDeIR {

	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();		
		gerenciador.AdicionaTributavel(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.Deposita(1000);
		System.out.printf("O saldo total é %.2f \n",cc.getSaldo());
		gerenciador.AdicionaTributavel(cc);
		
		System.out.println(gerenciador.getTotal());
	}

}
