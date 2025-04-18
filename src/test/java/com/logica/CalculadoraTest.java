package com.logica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
	
	@Test
	public void testSomaDoisValoresPositivos() {
	
		Calculadora calculadora = new Calculadora();
		Integer total = calculadora.soma(8, 21);
		
		//Compara valor esperado com o valor atual
		Assertions.assertEquals(29, total);		
	}
	
	@Test
	public void testSomaDoisValoresNegativos() {
		Calculadora calc = new Calculadora();
		Integer total = calc.soma(-8, -11);
		
		Assertions.assertEquals(-19, total);		
	}
	
	@Test
	public void testSomaZero() {
		Calculadora calc = new Calculadora();
		Integer total = calc.soma(0, 0);
		
		Assertions.assertEquals(0, total);	
	}
	
	@Test
	public void testSubtracaoValor1Maior() {
		Calculadora calc = new Calculadora();
		Integer total = calc.subtracao(50, 25);
		
		Assertions.assertEquals(25, total);
	}
	
	@Test
	public void testSubtracaoValor1Menor() {
		Calculadora calc = new Calculadora();
		Integer total = calc.subtracao(23, 25);
		
		Assertions.assertEquals(2, total);
	}
	
	@Test
	public void testSubtracaoValoresIguais() {
		Calculadora calc = new Calculadora();
		Integer total = calc.subtracao(25, 25);
		
		Assertions.assertEquals(0, total);  
	}
	
	@Test
	public void testFatorialDeCinco() {
		Calculadora calculadora = new Calculadora();
		Integer resultadoFatorial = calculadora.fatorial(5);
		Assertions.assertEquals(120, resultadoFatorial);
		
	}
	
	@Test
	public void testFatorialDeZero() {
		Calculadora calc = new Calculadora();
		Integer resultadoFatorial = calc.fatorial(0);
		Assertions.assertEquals(1, resultadoFatorial);
	}
	
	@Test
	public void testFatorialDeNegativo() {
		Calculadora calc = new Calculadora();
		//Fatorial de número negativo não existe
		Integer resultadoFatorial = calc.fatorial(-1);
		Assertions.assertEquals(0, resultadoFatorial);
	}
	
}
