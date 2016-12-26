package br.com.focus3d.banco;

import br.com.focus3d.conta.ContaCorrente;
import br.com.focus3d.sistema.Tributavel;

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
