package org.iftm.primeiroSpringBoot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testaSomaCorretaParaDoisInteirosPositivos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 15;
		
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}

	@Test
	public void testaSomaCorretaParaDoisInteirosNegativos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = -10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = -5;
		
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	@Test
	public void testarDividirNaoAceitaDivisorZero() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 0;	
		Assertions.assertThrows(
				ArithmeticException.class, 
				()->{
					calculadora.dividir(entradaNumero1, entradaNumero2);
					},
				"Houve divisão por zero!!"
				);

	}
	
}
