
package br.com.devdojo.javacore.exception.custom;

public class LoginInvalidoException extends Exception {

	private static final long serialVersionUID = 3598303938123413005L;

	public LoginInvalidoException() {
		super("Usu�rio ou senha inv�lidos...");
	}
}
