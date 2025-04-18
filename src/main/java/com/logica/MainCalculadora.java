package com.logica;

public class MainCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		Integer total = calc.soma(8, 10);
		
		System.out.println("O total da soma é: "+ total);
	}
}
