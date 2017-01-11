package br.com.focus3d.banco;

import java.util.HashSet;

import br.com.focus3d.conta.Conta;
import br.com.focus3d.conta.ContaCorrente;

public class TestaHashCodeAndEquals {

	public static void main(String[] args) {
		
		HashSet<Conta> listaDeContas = new HashSet<>();
		
		Conta cc1 = new ContaCorrente(10,"Maria");
		cc1.Deposita(150.52);
		
		Conta cc2 = new ContaCorrente(10,"Maria");
		cc2.Deposita(150.52);
		
		Conta cc3 = new ContaCorrente(12, "Paulo");
		cc3.Deposita(35.68);
		
		
		listaDeContas.add(cc1);
		listaDeContas.add(cc2);
		listaDeContas.add(cc3);
		
		System.out.println(listaDeContas.size());
		
	}

}
