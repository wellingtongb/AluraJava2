package br.com.focus3d.sistema;

import br.com.focus3d.conta.Conta;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
    	System.out.println("===============================");
        // aqui você imprime o saldo anterior
    	System.out.printf("Saldo anterior: %.2f", c.getSaldo());
        // atualiza a conta com a taxa selic,
    	c.Atualiza(this.selic);
        // e depois imprime o saldo final
    	System.out.printf("Saldo Atualizado: %.2f", c.getSaldo());
        // lembrando de somar o saldo final ao atributo saldoTotal
    	this.saldoTotal += c.getSaldo();
    	
    }


    // outros métodos, colocar o getter para saldoTotal!
	public double getSaldoTotal() {
		return saldoTotal;
	}

}
