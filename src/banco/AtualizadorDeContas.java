package banco;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
    	System.out.println("===============================");
        // aqui você imprime o saldo anterior
    	System.out.println("Saldo anterior: " + c.getSaldo());
        // atualiza a conta com a taxa selic,
    	c.Atualiza(this.selic);
        // e depois imprime o saldo final
    	System.out.println("Saldo Atualizado: " + c.getSaldo());
        // lembrando de somar o saldo final ao atributo saldoTotal
    	this.saldoTotal += c.getSaldo();
    	
    }


    // outros métodos, colocar o getter para saldoTotal!
	public double getSaldoTotal() {
		return saldoTotal;
	}

}
