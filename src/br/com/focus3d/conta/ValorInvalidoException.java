package br.com.focus3d.conta;

public class ValorInvalidoException extends RuntimeException{
	
	public ValorInvalidoException (Double valor) {
		super("Valor inválido "+ valor);
	}

}
