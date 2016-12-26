package br.com.focus3d.banco;

import br.com.focus3d.conta.Conta;
import br.com.focus3d.conta.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(10, "joao");
		Conta cc2 = new ContaCorrente(10, "carlos");		
		
		if (cc1 == cc2)
            System.out.println("mesmo objeto");
        else 
            System.out.println("outro objeto");

        if (cc1.equals(cc2))
            System.out.println("objeto equivalente");
        else 
            System.out.println("objeto nao equivalente");
        
        

	}

}
