package br.com.devdojo.javacore.classesinternars.teste;

import br.com.devdojo.javacore.classesinternars.teste.Externa.InternaStatica1;
import br.com.devdojo.javacore.classesinternars.teste.Externa.InternaStatica2;

class Externa {
	static class InternaStatica1 {
		public void imprimir() {
			System.out.println("oi interna statica 1");
		}
	}
	
	static class InternaStatica2 {
		public void imprimir() {
			System.out.println("oi interna statica 2");
		}
	}
}

public class ClassesInternasEstaticasTest {
	
	public static void main(String[] args) {
		InternaStatica1 internaStatica1 = new Externa.InternaStatica1();
		internaStatica1.imprimir();
		
		InternaStatica2 internaStatica2 = new Externa.InternaStatica2();
		internaStatica2.imprimir();
		
		Interna2 interna2 = new Interna2();
		interna2.imprimir();
	}
	
	static class Interna2 {
		public void imprimir() {
			System.out.println("oi imprimindo");
		}
	}

}
