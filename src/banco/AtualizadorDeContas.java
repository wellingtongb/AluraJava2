package banco;

public class AtualizadorDeContas {
	
	private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        // aqui voc� imprime o saldo anterior
        // atualiza a conta com a taxa selic,
        // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal
    }

    // outros m�todos, colocar o getter para saldoTotal!

}
