package com.logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Variaveis {

	public static void main(String[] args) {
		
		//Variáveis do tipo String		
		String nome = "Antonio";
		String sobrenome = "Trindade";
		
		System.out.println(nome +" "+sobrenome);
		
		//Variáveis do tipo Integer
		Integer valor1 = 5;
		Integer valor2 = 18;
		
		Integer total = valor1 + valor2;
		
		System.out.println("O valor total é "+ total);
		
		//Variáveis do tipo Double
		Double valor03 = 15.88;
		Double valor04 = 45.92;
		
		Double totalDouble = valor03 * valor04;
		System.out.println("O valor double total é "+ totalDouble);
		
		//Variáveis do tipo Boolean
		Boolean casado = false;
		
		if (casado) {
			System.out.println("A pessoa é casada!");
		}
		else {
			System.out.println("A pessoal é solteira!");
		}
		
		//Variáveis do tipo Date
		Date atual = new Date();
		System.out.println("A data atual é "+ atual);
		
		//Conversao de string para integer
		Integer ano = Integer.parseInt("2025");		
		System.out.println("O ano é "+ ano);
		
		// looping com for valor inicial e final
		for (int i = 1; i <= 10; i++) {
			System.out.println("O valor de i é: "+ i);
		}
		
		// looping com while
		int i = 1;
		while (i <= 10) {
			System.out.println("O valor de i no while é "+ i);
			i++;			
		}
		
		// looping em lista
		List<String> produtos = new ArrayList<String>();
		
		produtos.add("TV 55");
		produtos.add("Alexa");
		produtos.add("iPhone");
		produtos.add("Android");
		
		for (String produto : produtos) {
			System.out.println("O produto é "+ produto);
		}
		
		System.out.println("O tamanho da minha lista é "+ produtos.size());
		System.out.println("O produto da segunda posição da lista é "+ produtos.get(1));
		
	}
}
