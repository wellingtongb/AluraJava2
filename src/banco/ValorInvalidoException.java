package banco;

public class ValorInvalidoException extends RuntimeException{
	
	public ValorInvalidoException (Double valor) {
		super("Valor inv�lido "+ valor);
	}

}
