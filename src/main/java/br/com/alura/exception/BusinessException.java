package br.com.alura.exception;

public class BusinessException extends Exception{

	private static final long serialVersionUID = 1L;

	public BusinessException() {
		super();
	}
	
	public BusinessException(String mensagem) {
		super(mensagem);
	}
	

}
