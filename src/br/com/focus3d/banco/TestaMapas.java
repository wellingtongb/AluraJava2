package br.com.focus3d.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.focus3d.conta.Conta;
import br.com.focus3d.conta.ContaCorrente;

public class TestaMapas {

	public static void main(String[] args) {

		Conta c1 = new ContaCorrente(01,"Carlos");
		c1.Deposita(150.25);
		
		Conta c2 = new ContaCorrente(02,"JOao");
		c2.Deposita(75.58);
		
		
		//criando um mapa sem o uso do generics <> para receber as contas
		//Map mapaDeContas = new HashMap<>();
		
		//Criando mapa com Generics especificando o tipo de objetos que ele irá receber
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("Gerente", c2);
		
		// por nao usar o generics <> especificando que tipo de mapa é, se faz necessário um casting na hora da atribuição
		//Conta contaDiretor = (Conta) mapaDeContas.get("diretor");
		
		//usando o generics nao precisa de casting
		Conta contaDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDiretor.getSaldo());
		
		
		
	}

}
