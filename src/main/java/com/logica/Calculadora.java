package com.logica;

public class Calculadora {

	public Integer soma(Integer valor01, Integer valor02) {		
		Integer total = valor01 + valor02;
		return total;		
	}
	
	public Integer subtracao(Integer valor01, Integer valor02) {
		Integer total = 0;
		
		if (valor01 > valor02) { 
			total = valor01 - valor02;
		}
		else if(valor01 < valor02) {
			total = valor02 - valor01;
		}
		else
			total = 0;
		
		return total; 
	}
	
	public Integer fatorial(Integer valor) {
		
		Integer fatorial = 1;
		if (valor < 0) {
			fatorial = 0;
		}		
		
		for (int i = 1; i <= valor; i++) {
			fatorial = fatorial * i;		
		}
		return fatorial;				
	}
		
}
