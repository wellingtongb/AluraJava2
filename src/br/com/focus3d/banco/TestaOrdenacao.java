package br.com.focus3d.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.focus3d.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		ContaPoupanca cp1 = new ContaPoupanca(03, "carlos");
		ContaPoupanca cp2 = new ContaPoupanca(04, "joao");
		ContaPoupanca cp3 = new ContaPoupanca(01, "Reginaldo");
		ContaPoupanca cp4 = new ContaPoupanca(02, "Zilu");
		
		cp1.Deposita(300.98);
		cp2.Deposita(500.35);
		cp3.Deposita(25.78);
		cp4.Deposita(780.57);
		
		contas.add(cp1);
		contas.add(cp2);
		contas.add(cp3);
		contas.add(cp4);
		
		Random randon = new Random();
		
		//criando e adicionando contas dentro de um for
		for(int i = 5; i < 15; i++){
			ContaPoupanca cp = new ContaPoupanca(i,"teste"+i);
			//nesse caso uso o next int para gerar numero inteiro e somo com o nextdouble para gerar numero depois da virgula
			cp.Deposita(randon.nextInt(1000) + randon.nextDouble());
			contas.add(cp);
		}
		
		System.out.println(contas);
		
		//ordena as contas atráves do metodo sobreescrito na classe conta poupança
		Collections.sort(contas);
		
		//embaralha as contas da lista de modo randomico
		//Collections.shuffle(contas);
		
		//para rotacionar os objetos dentro da lista, passando a lista e um intervalo de rotaçao
		//Collections.rotate(contas, 1);
		
		for(ContaPoupanca conta : contas){
			System.out.println(conta);
		}
		

	}

}
