package br.com.focus3d.sistema;

public class GerenciadorDeImpostoDeRenda {
	
	private int total;
	
	public void AdicionaTributavel(Tributavel t){
		
		System.out.println("Adicionando tributavel "+ t);
		
		this.total += t.calculaTributos();
	}

	public int getTotal() {
		return this.total;
	}
	
	

}
