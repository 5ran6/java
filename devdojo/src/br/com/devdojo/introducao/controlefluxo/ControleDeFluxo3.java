package br.com.devdojo.introducao.controlefluxo;

public class ControleDeFluxo3 {

	public static void main(String[] args) {
		byte dia = 5;

		// Pode-se usar os tipos: char, int, byte short, enum, String
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("ErrorS");
			break;
		}
		
		char sexo = 'M';
		switch (sexo) {
		case 'F':
			System.out.println("Feminino");
			break;
		case 'M':
			System.out.println("Masculino");
			break;
		default:
			System.out.println("Op��o inv�lida!");
			break;
		}
	}
}
