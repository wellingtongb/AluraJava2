package br.com.focus3d.conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

	private List<Conta> contas = new ArrayList<Conta>();
	private Map<String, Conta> mapaContas = new HashMap<>();
	
	public void AdicionaConta(Conta conta) {
		this.contas.add(conta);
		mapaContas.put(conta.getNome(), conta);
		System.out.println("Conta Adicionada com sucesso");		
	}
	
	public Conta Pega(int posicao) {		
		return contas.get(posicao);
	}
	
	public int pegaQuantidadeDeContas() {
		return contas.size();		
	}
	
	public Conta buscaPorNome(String nome) {
		return mapaContas.get(nome);
	}
}
