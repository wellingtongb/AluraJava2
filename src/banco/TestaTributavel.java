package banco;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.Deposita(100);
		System.out.println(cc.calculaTributos());
		
		//Testando o polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		//System.out.println(t.getSaldo());

	}

}
