package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroExecption;

public class CalculadoraTest {

	private Calculadora calc;

	@Before
	public void setup() {
		calc = new Calculadora();
	}

	@Test
	public void deveSomarDoisValores() {
		// cenario
		int a = 5;
		int b = 2;
		
		// acao
		int resultado = calc.soma(a, b);

		// verificacao
		assertEquals(7, resultado);
	}

	@Test
	public void deveSubtrairDoisValores() {
		// cenario
		int a = 5;
		int b = 2;
		
		// acao
		int resultado = calc.subtrair(a, b);

		// verificacao
		assertEquals(3, resultado);
	}

	@Test
	public void deveDividirDoisValores() throws NaoPodeDividirPorZeroExecption {
		// cenario
		int a = 6;
		int b = 3;
		
		// acao
		int resultado = calc.divide(a, b);

		// verificacao
		assertEquals(2, resultado);
	}

	@Test(expected = NaoPodeDividirPorZeroExecption.class)
	public void deveLancarUmaExcecaoAoDividirPorZero() throws NaoPodeDividirPorZeroExecption {
		// cenario
		int a = 10;
		int b = 0;
		Calculadora calc = new Calculadora();

		// acao
		int resultado = calc.divide(a, b);

		// verificacao
		assertEquals(2, resultado);
	}

}
