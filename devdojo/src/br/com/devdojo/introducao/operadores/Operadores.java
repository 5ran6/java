package br.com.devdojo.introducao.operadores;

public class Operadores {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 21;
		
		System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
		System.out.println("A soma e: " + (num1 + num2));
		System.out.println("A subtra��o e: " + (num1 - num2));
		System.out.println("A multiplica��o e: " + (num1 * num2));
		System.out.println("A divis�o e: " + (num1 / num2));
		System.out.println("A soma " + (num1 + num2) + " � : " + (((num1 + num2)%2) == 0 ? "Par" : "Impar"));
	}

}
