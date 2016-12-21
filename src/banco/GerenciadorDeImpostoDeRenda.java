package banco;

public class GerenciadorDeImpostoDeRenda {
	
	private int total;
	
	void AdicionaTributavel(Tributavel t){
		
		System.out.println("Adicionando tributavel "+ t);
		
		this.total += t.calculaTributos();
	}

	public int getTotal() {
		return this.total;
	}
	
	

}
