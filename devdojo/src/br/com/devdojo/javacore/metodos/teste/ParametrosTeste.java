package br.com.devdojo.javacore.metodos.teste;

import br.com.devdojo.javacore.metodos.Calculadora;

public class ParametrosTeste {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int num1 = 10;
		int num2 = 20;
		calculadora.alteraDoisNumeros(num1, num2);
		System.out.println("Dentro do teste");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}
